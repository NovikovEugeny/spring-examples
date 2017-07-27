package by.tc.test.service;

import by.tc.test.entity.Order;

public interface OrderService {

    Order findOrderById(int id);

    Order add(Order order);

    void addWithRecipe(int orderId, String recipeCode);

}