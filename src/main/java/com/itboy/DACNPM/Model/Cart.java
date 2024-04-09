package com.itboy.DACNPM.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCart;
    @OneToMany
    private List<Product> items;
    private long idUser;

    public Cart(long idCart, List<Product> items, long idUser) {
        this.idCart = idCart;
        this.items = items;
        this.idUser = idUser;
    }

    public Cart() {

    }

    public long getIdCart() {
        return idCart;
    }

    public void setIdCart(long idCart) {
        this.idCart = idCart;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }
}
