//package com.example.QuanLyNhaHang.repository;
//
//import com.example.QuanLyNhaHang.entity.CartItem;
//import com.example.QuanLyNhaHang.entity.MonAn;
//import com.example.QuanLyNhaHang.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface CartItemRepository extends JpaRepository<CartItem, Long> {
//
//    public List <CartItem> findByUser(User user);
//
//    public CartItem findByUserAndMonAn(User user, MonAn monAn);
//
//    @Query("UPDATE cart_items c SET c.quantity = ?1 WHERE c.user_id = ?2 AND c.monan_id = ?3")
//    @Modifying
//    public void updateQuantity(int quantity, Long monAnID, Long userID);
//
//
//}
