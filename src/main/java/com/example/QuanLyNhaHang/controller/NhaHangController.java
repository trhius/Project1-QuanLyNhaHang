package com.example.QuanLyNhaHang.controller;

import com.example.QuanLyNhaHang.entity.MonAn;
import com.example.QuanLyNhaHang.entity.User;
import com.example.QuanLyNhaHang.repository.UserRepository;
import com.example.QuanLyNhaHang.service.NhaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NhaHangController {
    @Autowired
    public NhaHangService nhaHangService;

    @GetMapping("/monans")
    public String listMonAn(Model model){
        model.addAttribute("monans", nhaHangService.getAllMonAn());
        return "monan";
    }

    @GetMapping("/monans/new")
    public String createMonAnForm(Model model){
        MonAn monAn = new MonAn();
        model.addAttribute("monan", monAn);
        return "create_monan";
    }

    @PostMapping("/monans")
    public String saveMonAn(@ModelAttribute("monan") MonAn monAn){
        nhaHangService.saveMonAn(monAn);
        return "redirect:/monans";
    }

    @GetMapping("/monans/edit/{id}")
    public String updateMonAnForm(@PathVariable Long id, Model model){
        model.addAttribute("monan", nhaHangService.getMonAnById(id));
        return "edit_monan";
    }

    @PostMapping("/monans/edit/{id}")
    public String updateMonAn(@PathVariable Long id, @ModelAttribute("monan") MonAn monAn, Model model){
        MonAn existingMonAn = nhaHangService.getMonAnById(id);
        existingMonAn.setId(id);
        existingMonAn.setMaMonAn(monAn.getMaMonAn());
        existingMonAn.setTenMonAn(monAn.getTenMonAn());
        existingMonAn.setLoaiMonAn(monAn.getLoaiMonAn());
        existingMonAn.setDoChay(monAn.getDoChay());
        existingMonAn.setDonGia(monAn.getDonGia());

        nhaHangService.updateMonAn(existingMonAn);

        return "redirect:/monans";
    }

    @GetMapping("/monans/{id}")
    public String deleteMonAn(@PathVariable Long id){
        nhaHangService.deleteMonAn(id);
        return "redirect:/monans";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    public String viewHomePage(){
        return "home";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model){
        model.addAttribute("user", new User());
        return "register_form";
    }

    @PostMapping("/process_register")
    public String processRegister(User user){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepository.save(user);
        return "register_success";
    }
}
