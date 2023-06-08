package com.example.QuanLyNhaHang;

import com.example.QuanLyNhaHang.entity.CartItem;
import com.example.QuanLyNhaHang.entity.MonAn;
import com.example.QuanLyNhaHang.entity.User;
import com.example.QuanLyNhaHang.repository.CartItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class CartTest {

    @Autowired
    private CartItemRepository cartRepo;

    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void TestAddOneItem(){
        MonAn monAn = entityManager.find(MonAn.class, 1);
        User user = entityManager.find(User.class, 2);

        CartItem newItem = new CartItem();
        newItem.setUser(user);
        newItem.setMonAn(monAn);
        newItem.setQuantity(5);

        CartItem saveCartItem = cartRepo.save(newItem);

        assert (saveCartItem.getId() > 0);
    }

    @Test
    public void testGetCartItemByUser(){
        User user = new User();
        user.setId(2L);

        List<CartItem> cartItems = cartRepo.findByUser(user);

        assertEquals(1, cartItems.size());
    }

}
