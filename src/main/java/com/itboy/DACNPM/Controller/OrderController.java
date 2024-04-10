package com.itboy.DACNPM.Controller;

import com.itboy.DACNPM.Model.Order;
import com.itboy.DACNPM.Service.Interface.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/order")
public class OrderController {
    //http://localhost:8080/api/order
    @Autowired
    private OrderService orderService;

    @GetMapping("/getAll")
    public List<Order> getAllProduct(){
        return orderService.getAllOrder();
    }

    @PostMapping("/add")
    public String addOrder(@RequestBody Order order){
        orderService.saveOrder(order);
        return "Đã thêm";
    }
    @GetMapping("/getId/{id}")
    public Optional<Order> getProducById(@PathVariable("id") long id){
        return orderService.getOrderById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteOrder(@PathVariable("id") long id){
        orderService.deleteOrder(id);
        return "Đã xóa ";
    }


}
