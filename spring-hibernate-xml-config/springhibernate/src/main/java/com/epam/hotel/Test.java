package com.epam.hotel;

import com.epam.hotel.dao.Dao;
import com.epam.hotel.entity.User;
import com.epam.hotel.service.UserService;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        /*Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setName("Jim");
        user.setAge(22);

        //session.save(user);

        System.out.println(session.get(User.class, 2));

        session.getTransaction().commit();*/

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


        UserService userService = (UserService) context.getBean("userService");
        //UserService userService = context.getBean(UserService.class);

        System.out.println(userService.show(1));

    }
}