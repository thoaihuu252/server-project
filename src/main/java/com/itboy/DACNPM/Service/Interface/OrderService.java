package com.itboy.DACNPM.Service.Interface;

import com.itboy.DACNPM.Model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public Order saveOrder(Order order);
    public List<Order> getAllOrder();
    public Optional<Order> getOrderById(Long id);
    public void deleteOrder(Long id);
}
