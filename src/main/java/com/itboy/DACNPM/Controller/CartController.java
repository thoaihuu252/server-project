package com.itboy.DACNPM.Controller;


import com.itboy.DACNPM.Model.Cart;
import com.itboy.DACNPM.Service.Interface.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/cart")
public class CartController {
    //http://localhost:8080/api/cart
    @Autowired
    private CartService cartService;
    @GetMapping("/getCart/{idUser}")
    public List<Cart> getCart(@PathVariable("idUser") long idUser){
        return cartService.getCartByUser(idUser);
    }
    @PostMapping("/add")
    public String addCart(@RequestBody Cart cart){
        cartService.saveCart(cart);
        return "Đã thêm";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCart(@PathVariable("id") long id){
        cartService.deleteCart(id);
        return "Đã xóa ";
    }

}
