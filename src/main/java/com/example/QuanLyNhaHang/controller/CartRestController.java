//package com.example.QuanLyNhaHang.controller;
//
//import com.example.QuanLyNhaHang.entity.User;
//import com.example.QuanLyNhaHang.service.CartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class CartRestController {
//
//    @Autowired
//    private CartService cartService;
//
//    @PostMapping("/cart/add/{monAnId}")
//    public String addMonAnToCart(@PathVariable("monAnId") Long id, @AuthenticationPrincipal User user){
//        int quantity = 1;
//        int addedQuantity = cartService.addMonAn(id, quantity, user);
//        return addedQuantity + " item(s) added to the cart";
//    }
//
//    @PostMapping("/cart/update/{monAnId}")
//    public String updateQuantity(@PathVariable("monAnId") Long id, @AuthenticationPrincipal User user){
//        int quantity = 1;
//        float subtotal = cartService.updateQuantity(id, quantity, user);
//        return String.valueOf(subtotal);
//    }
//}
