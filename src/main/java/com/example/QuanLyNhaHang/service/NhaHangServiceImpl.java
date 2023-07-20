package com.example.QuanLyNhaHang.service;

import com.example.QuanLyNhaHang.entity.MonAn;
import com.example.QuanLyNhaHang.repository.NhaHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhaHangServiceImpl implements NhaHangService{
    @Autowired
    NhaHangRepository nhaHangRepository;

    @Override
    public List<MonAn> getAllMonAn() {
        return nhaHangRepository.findAll();
    }

    @Override
    public MonAn saveMonAn(MonAn monAn) {
        return nhaHangRepository.save(monAn);
    }

    @Override
    public MonAn getMonAnById(Long id) {
        return nhaHangRepository.findById(id).get();
    }

    @Override
    public MonAn updateMonAn(MonAn monAn) {
        return nhaHangRepository.save(monAn);
    }

    @Override
    public void deleteMonAn(Long id) {
        nhaHangRepository.deleteById(id);
    }
}
