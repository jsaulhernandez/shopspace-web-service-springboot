package com.shopspace.shopspacewebservice.service.impl;

import com.shopspace.shopspacewebservice.client.CouponClient;
import com.shopspace.shopspacewebservice.dto.CouponDTO;
import com.shopspace.shopspacewebservice.exception.ResourceNotFoundException;
import com.shopspace.shopspacewebservice.service.CouponService;
import com.shopspace.shopspacewebservice.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    CouponClient couponClient;

    @Override
    public Object validateCoupon(String code){
        CouponDTO coupon;
        Optional<CouponDTO> data = couponClient.getCouponByCode(code);

        if (data.isEmpty()) throw new ResourceNotFoundException("Coupon code not found");

        coupon = data.get();
        if (coupon.getStatus() == 0) throw new ResourceNotFoundException("Coupon code not found");

        if (DateUtil.compareDates(coupon.getExpireAt(), new Date()) >= 0) return coupon;

        return new CouponDTO();
    }
}
