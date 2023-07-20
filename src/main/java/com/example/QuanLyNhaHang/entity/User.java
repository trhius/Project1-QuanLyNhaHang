package com.example.QuanLyNhaHang.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String email;
    @Column
    private String password;
    @Column
    private String hoTen;
    @Column
    private String sDT;
    @Column
    private String userName;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String email, String password, String hoTen, String sDT, String userName, Role role) {
        this.email = email;
        this.password = password;
        this.hoTen = hoTen;
        this.sDT = sDT;
        this.userName = userName;
        this.role = role;
    }
}
