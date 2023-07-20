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
    private String tenMonAn;

    @Column
    private String moTa;

    @Column
    private String nguyenLieu;

    @Column
    private String danhMuc;

    @Column
    private long donGia;

    @Column
    private double diemDanhGia;

    @Column
    private String note;
}
