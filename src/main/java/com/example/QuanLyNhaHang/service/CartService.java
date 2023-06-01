package com.example.QuanLyNhaHang.service;

import com.example.QuanLyNhaHang.entity.CartItem;
import com.example.QuanLyNhaHang.entity.User;
import com.example.QuanLyNhaHang.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartItemRepository cartRepo;

    public List <CartItem> listCartItems(User user){
        return cartRepo.findByUser(user);
    }
}
