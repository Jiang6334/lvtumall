package com.future.lvtumall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.common.to.SkuReductionTo;
import com.future.common.utils.PageUtils;
import com.future.lvtumall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author 夏沫止水
 * @email HeJieLin@lvtumall.com
 * @date 2020-05-22 19:35:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

