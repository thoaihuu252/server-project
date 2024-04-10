package com.itboy.DACNPM.Service.Imp;


import com.itboy.DACNPM.Model.Order;
import com.itboy.DACNPM.Repository.OrderRepository;
import com.itboy.DACNPM.Service.Interface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    private OrderRepository orderReposity;
    @Override
    public Order saveOrder(Order order) {
        return   orderReposity.save(order);
    }

    @Override
    public List<Order> getAllOrder() {
        return orderReposity.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderReposity.findById(id);
    }

    @Override
    public void deleteOrder(Long id) {
        orderReposity.deleteById(id);

    }
}
