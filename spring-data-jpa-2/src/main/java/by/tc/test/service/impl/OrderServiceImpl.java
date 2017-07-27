package by.tc.test.service.impl;

import by.tc.test.entity.Order;
import by.tc.test.repository.OrderRepository;
import by.tc.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order findOrderById(int id) {
        return orderRepository.findOrderById(id);
    }

    @Override
    public Order add(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void addWithRecipe(int orderId, String recipeCode) {
        orderRepository.saveWithRecipe(orderId, recipeCode);
    }
}