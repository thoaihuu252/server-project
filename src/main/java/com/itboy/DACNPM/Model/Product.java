package com.itboy.DACNPM.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduct;
    private String nameProduct;
    private int priceProduct;
    private int quantity;
    @ElementCollection
    private List<String> imgProduct;
    @OneToMany
    private List<Evaluate> evaluate;

    public Product(long idProduct, String nameProduct, int priceProduct, int quantity, List<String> imgProduct, List<Evaluate> evaluate) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.quantity = quantity;
        this.imgProduct = imgProduct;
        this.evaluate = evaluate;
    }

    public Product() {

    }

    public long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(long idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<String> getImgProduct() {
        return imgProduct;
    }

    public void setImgProduct(List<String> imgProduct) {
        this.imgProduct = imgProduct;
    }

    public List<Evaluate> getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(List<Evaluate> evaluate) {
        this.evaluate = evaluate;
    }
}
