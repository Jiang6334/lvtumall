package com.future.lvtumall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.future.lvtumall.coupon.entity.CouponEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author 夏沫止水
 * @email HeJieLin@lvtumall.com
 * @date 2020-05-22 19:35:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
