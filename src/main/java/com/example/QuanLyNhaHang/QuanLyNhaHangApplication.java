package com.example.QuanLyNhaHang;

import com.example.QuanLyNhaHang.repository.NhaHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuanLyNhaHangApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QuanLyNhaHangApplication.class, args);
	}

	@Autowired
	private NhaHangRepository nhaHangRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
