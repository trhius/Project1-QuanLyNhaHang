//package com.example.QuanLyNhaHang.controller;
//
//import com.example.QuanLyNhaHang.entity.CartItem;
//import com.example.QuanLyNhaHang.entity.User;
//import com.example.QuanLyNhaHang.service.CartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class CartController {
//
//    @Autowired
//    private CartService cartService;
//
//
//    @GetMapping("/cart")
//    public String showCart(Model model, @AuthenticationPrincipal User user){
//        List <CartItem> cartItems = cartService.listCartItems(user);
//        model.addAttribute("cartItems", cartItems);
//        return "cart";
//    }
//}
