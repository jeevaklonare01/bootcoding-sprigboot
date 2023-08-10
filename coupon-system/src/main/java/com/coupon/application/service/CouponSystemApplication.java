package com.coupon.application.service;

import com.coupon.application.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class
CouponSystemApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(CouponSystemApplication.class, args);
	}

	@Autowired
	private CouponService couponService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Hello World");

		String newCoupon = couponService.getNewCoupon();
		System.out.println(newCoupon);
		List<String> couponsList = couponService.getNewCoupon(100);
		for(String coupon: couponsList){
			System.out.println(coupon);
		}
	}
}