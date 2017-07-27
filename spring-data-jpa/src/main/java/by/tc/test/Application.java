package by.tc.test;

import by.tc.test.config.DataConfig;
import by.tc.test.entity.SuperUser;
import by.tc.test.entity.User;
import by.tc.test.service.SuperUserService;
import by.tc.test.service.UserService;
import by.tc.test.service.impl.SuperUserServiceImpl;
import by.tc.test.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);
        UserService userService = context.getBean(UserServiceImpl.class);
        SuperUserService superUserService = context.getBean(SuperUserServiceImpl.class);

        List<User> users = userService.findAllUsers();

        for (User user : users) {
            System.out.println(user);
        }

        List<SuperUser> superUser = superUserService.findAll();

        System.out.println(superUser);

    }
}
