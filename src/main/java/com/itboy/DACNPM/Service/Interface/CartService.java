package com.itboy.DACNPM.Service.Interface;

import com.itboy.DACNPM.Model.Cart;

import java.util.List;

public interface CartService {
    public Cart saveCart(Cart cart);
    public List<Cart> getCartByUser(Long idUser);
    public void deleteCart(Long id);
}
