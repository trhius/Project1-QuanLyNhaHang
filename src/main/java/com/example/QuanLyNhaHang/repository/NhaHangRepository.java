package com.example.QuanLyNhaHang.repository;

import com.example.QuanLyNhaHang.entity.MonAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NhaHangRepository extends JpaRepository<MonAn, Long> {

}
