package com.example.QuanLyNhaHang.service;

import com.example.QuanLyNhaHang.entity.MonAn;

import java.util.List;

public interface NhaHangService {
    List<MonAn> getAllMonAn();
    MonAn saveMonAn(MonAn monAn);
    MonAn getMonAnById(Long id);
    MonAn updateMonAn(MonAn monAn);
    void deleteMonAn(Long id);

}
