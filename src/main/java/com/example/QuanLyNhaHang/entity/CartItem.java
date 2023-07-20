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
@Table(name = "cart_items")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "monan_id")
    private MonAn monAn;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column
    private int quantity;

    @Transient
    public float getSubTotal(){
        return this.monAn.getDonGia() * quantity;
    }
}

