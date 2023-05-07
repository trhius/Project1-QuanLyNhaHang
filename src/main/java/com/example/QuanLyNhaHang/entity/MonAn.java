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
@Table(name = "monans")
public class MonAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String maMonAn;

    @Column
    private String tenMonAn;

    @Column
    private String loaiMonAn;

    @Column
    private String doChay;

    @Column
    private double donGia;

    public MonAn(String maMonAn, String tenMonAn, String loaiMonAn, String doChay, double donGia) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.loaiMonAn = loaiMonAn;
        this.doChay = doChay;
        this.donGia = donGia;
    }
}
