package com.example.roleBased.entity;

import com.example.roleBased.dto.ProductDto;
import lombok.*;

import javax.persistence.*;
import java.util.Optional;

@Data
@Getter
@Setter
@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartId;
    private int quantity;
    private double totalPrice;
    @OneToOne
    private Product product;
    @OneToOne
    private User user;
    @GeneratedValue
    private int uCartId;


    public Cart() {

    }
    public Cart(Product product, User user) {
        this.product=product;
        this.user=user;

    }

    public Cart(int cartId, int quantity, double totalPrice, Product product, User user, int uCartId) {
        this.cartId = cartId;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.product = product;
        this.user = user;
        this.uCartId=uCartId;
    }

    public int getuCartId() {
        return uCartId;
    }

    public void setuCartId(int uCartId) {
        this.uCartId = uCartId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
