package com.future.lvtumall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.common.utils.PageUtils;
import com.future.lvtumall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author aya
 * @email HeJieLin@lvtumall.com
 * @date 2020-05-22 19:35:30
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

