package com.example.ecommercebackend.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(
        name = "users",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        }
)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @NotBlank
    @Column(name = "username", nullable = false)
    private String userName;

    @Email
    @Column(nullable = false)
    private String email;

    @NotBlank
    @Size(max = 120)
    @Column(nullable = false)
    private String password;

    // Many-to-Many với Role
    @ManyToMany(
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.EAGER
    )
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    // One-to-Many với Product
    @OneToMany(
            mappedBy = "user",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            orphanRemoval = true
    )
    private Set<Product> products = new HashSet<>();

    // One-to-Many với Address
    @OneToMany(
            mappedBy = "user",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    @JsonManagedReference
    private List<Address> addresses = new ArrayList<>();

    // One-to-One với Cart
    @OneToOne(
            mappedBy = "user",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE},
            orphanRemoval = true
    )
    private Cart cart;

    // Constructors
    public User() {}

    public User(Long userId, String userName, String email, String password,
                Set<Role> roles, Set<Product> products, List<Address> addresses, Cart cart) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.products = products;
        this.addresses = addresses;
        this.cart = cart;
    }

    public User(String username, String email, String password) {
        this.userName = username;
        this.email = email;
        this.password = password;
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
    public Cart getCart() {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
