package com.itboy.DACNPM.Model;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "order_table") // Đặt tên bảng là "order_table"
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idOrder;
    private long idUser;
    @OneToMany
    private List<Product> itemOrder;
    private LocalDateTime ordered;
    private String status;
    private int total;
    private long idVoucher;

    public Order(long idOrder, long idUser, List<Product> itemOrder, LocalDateTime ordered, String status, int total, long idVoucher) {
        this.idOrder = idOrder;
        this.idUser = idUser;
        this.itemOrder = itemOrder;
        this.ordered = ordered;
        this.status = status;
        this.total = total;
        this.idVoucher = idVoucher;
    }
    public Order(){}

    public long getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(long idOrder) {
        this.idOrder = idOrder;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public List<Product> getItemOrder() {
        return itemOrder;
    }

    public void setItemOrder(List<Product> itemOrder) {
        this.itemOrder = itemOrder;
    }

    public LocalDateTime getOrdered() {
        return ordered;
    }

    public void setOrdered(LocalDateTime ordered) {
        this.ordered = ordered;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public long getIdVoucher() {
        return idVoucher;
    }

    public void setIdVoucher(long idVoucher) {
        this.idVoucher = idVoucher;
    }
}
