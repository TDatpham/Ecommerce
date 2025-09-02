package com.example.ecommercebackend.dto;

import com.example.ecommercebackend.model.Address;
import com.example.ecommercebackend.model.Product;
import com.example.ecommercebackend.model.Role;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDTO {

    private Long userId;
    private String userName;
    private String email;
    private String password;
    private Set<Role> roles = new HashSet<>();
    private Set<Product> products;
    private List<Address> addresses = new ArrayList<>();

    // Default constructor
    public UserDTO() {
    }

    // All args constructor
    public UserDTO(Long userId, String userName, String email, String password,
                   Set<Role> roles, Set<Product> products, List<Address> addresses) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.products = products;
        this.addresses = addresses;
    }

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
