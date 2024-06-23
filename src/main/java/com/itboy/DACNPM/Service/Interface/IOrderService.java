package com.itboy.DACNPM.Service.Interface;

import com.itboy.DACNPM.dtos.OrderDTO;
import com.itboy.DACNPM.exceptions.DataNotFoundException;
import com.itboy.DACNPM.models.Order;

import java.util.List;

public interface IOrderService {
    Order createOrder(OrderDTO orderDTO) throws Exception;
    Order getOrder(Long id);
    Order updateOrder(Long id, OrderDTO orderDTO) throws DataNotFoundException;
    void deleteOrder(Long id);
    List<Order> findByUserId(Long userId);
    List<Order> getAllOrder();
}
