package com.shopspace.shopspacewebservice.controller;

import com.shopspace.shopspacewebservice.dto.response.ResponseDTO;
import com.shopspace.shopspacewebservice.service.CouponService;
import com.shopspace.shopspacewebservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coupon")
public class CouponController {
    @Autowired
    CouponService couponService;

    @GetMapping("/validate/{code}")
    public ResponseEntity<ResponseDTO> create(@PathVariable("code") String code){
        return ResponseUtil.ok(couponService.validateCoupon(code));
    }
}
