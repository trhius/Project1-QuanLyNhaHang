package com.example.QuanLyNhaHang.repository;

import com.example.QuanLyNhaHang.entity.CartItem;
import com.example.QuanLyNhaHang.entity.MonAn;
import com.example.QuanLyNhaHang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

    public List <CartItem> findByUser(User user);

    public CartItem findByUserAndMonAn(User user, MonAn monAn);

}
