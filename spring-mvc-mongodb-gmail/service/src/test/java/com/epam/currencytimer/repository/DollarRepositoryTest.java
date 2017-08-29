package com.epam.currencytimer.repository;

import com.epam.currencytimer.config.DataConfig;
import com.epam.currencytimer.entity.Dollar;
import com.epam.currencytimer.service.DollarService;
import com.epam.currencytimer.service.exception.SendingException;
import com.epam.currencytimer.service.util.Messanger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
@TestExecutionListeners(DependencyInjectionTestExecutionListener.class)
public class DollarRepositoryTest {

    @Autowired
    private DollarService dollarService;

    @Test
    public void test() throws SendingException {

        for (Dollar dollar : dollarService.findAll()) {
            System.out.println(dollar);
        }
    }

}