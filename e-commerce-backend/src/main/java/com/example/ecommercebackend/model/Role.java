package com.example.ecommercebackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles") // tên bảng rõ ràng
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id") // định nghĩa tên cột
    private Integer roleId;

    @Enumerated(EnumType.STRING) // lưu tên ENUM thay vì index
    @Column(name = "role_name", nullable = false, unique = true, length = 50)
    private AppRole roleName;

    // Constructors
    public Role() {
    }

    public Role(Integer roleId, AppRole roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }

    public Role(AppRole roleName) {
        this.roleName = roleName;
    }

    // Getters and Setters
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public AppRole getRoleName() {
        return roleName;
    }

    public void setRoleName(AppRole roleName) {
        this.roleName = roleName;
    }
}
