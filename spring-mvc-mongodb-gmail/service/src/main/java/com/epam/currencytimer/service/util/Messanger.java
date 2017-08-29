package com.epam.currencytimer.service.util;

import com.epam.currencytimer.service.exception.ExceptionMessage;
import com.epam.currencytimer.service.exception.SendingException;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public final class Messanger {

    private static final String USERNAME = "zhenyanovikov96@gmail.com";
    private static final String PASSWORD = "27061996";
    private static final String TO = "zhenyanovikov96@gmail.com";
    private static final String SUBJECT = "Currency status";


    public static void alert(String status) throws SendingException {

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(USERNAME, PASSWORD);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(TO));
            message.setSubject(SUBJECT);
            message.setText(status);

            Transport.send(message);

        } catch (MessagingException exc) {
            throw new SendingException(ExceptionMessage.SENDING_ERROR);
        }

    }

}