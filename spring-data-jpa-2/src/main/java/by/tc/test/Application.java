package by.tc.test;

import by.tc.test.config.DataConfig;
import by.tc.test.entity.Order;
import by.tc.test.entity.Recipe;
import by.tc.test.service.*;
import by.tc.test.service.impl.*;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(DataConfig.class);

        OrderService orderService = context.getBean(OrderServiceImpl.class);
        RecipeService recipeService = context.getBean(RecipeServiceImpl.class);
        UserService userService = context.getBean(UserServiceImpl.class);
        AccountService accountService = context.getBean(AccountServiceImpl.class);
        DrugService drugService = context.getBean(DrugServiceImpl.class);

        /*System.out.println(userService.findUserByMobile("+375294444444").getOrders());
        System.out.println(orderService.findOrderById(1));
        System.out.println(recipeService.findRecipeByCode("r00001"));
        System.out.println(accountService.findAccountById(1).getBalance());
        System.out.println(drugService.findDrugById(12));
        System.out.println(userService.findUserByMobile("+375294444444").getAccount().getBalance());*/

        Set<Recipe> recipes = orderService.findOrderById(1).getRecipes();

        System.out.println("recipes for order #1:");

        for (Recipe recipe : recipes) {
            System.out.println(recipe.getCode());
        }







    }
}
