package com.example.ecommercebackend.dto;

import java.util.ArrayList;
import java.util.List;

public class CartDTO {
    private Long cartId;
    private List<ProductDTO> products = new ArrayList<>();
    private Double totalPrice = 0.0;

    // Constructors
    public CartDTO() {
    }

    public CartDTO(Long cartId, List<ProductDTO> products, Double totalPrice) {
        this.cartId = cartId;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
