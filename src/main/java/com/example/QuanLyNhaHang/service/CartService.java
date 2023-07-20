//package com.example.QuanLyNhaHang.service;
//
//import com.example.QuanLyNhaHang.entity.CartItem;
//import com.example.QuanLyNhaHang.entity.MonAn;
//import com.example.QuanLyNhaHang.entity.User;
//import com.example.QuanLyNhaHang.repository.CartItemRepository;
//import com.example.QuanLyNhaHang.repository.NhaHangRepository;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//@Transactional
//public class CartService {
//    @Autowired
//    private CartItemRepository cartRepo;
//
//    @Autowired
//    private NhaHangRepository nhaHangRepo;
//
//    public List <CartItem> listCartItems(User user){
//        return cartRepo.findByUser(user);
//    }
//
//    public int addMonAn(Long monAnId, int quantity, User user){
//        int addedQuantity = quantity;
//
//        MonAn monAn = nhaHangRepo.findById(monAnId).get();
//
//        CartItem cartItem = cartRepo.findByUserAndMonAn(user, monAn);
//
//        if (cartItem != null){
//            addedQuantity = cartItem.getQuantity() + quantity;
//            cartItem.setQuantity(addedQuantity);
//        } else {
//            cartItem = new CartItem();
//            cartItem.setQuantity(quantity);
//            cartItem.setUser(user);
//            cartItem.setMonAn(monAn);
//        }
//
//        cartRepo.save(cartItem);
//        return addedQuantity;
//    }
//
//    public float updateQuantity(Long monAnID, int quantity, User user){
//        cartRepo.updateQuantity(quantity, monAnID, user.getId());
//        MonAn monAn = nhaHangRepo.findById(monAnID).get();
//
//        float subtotal = monAn.getDonGia() * quantity;
//        return subtotal;
//    }
//
//}
