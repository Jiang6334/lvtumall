package com.future.lvtumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.common.utils.PageUtils;
import com.future.lvtumall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author aya
 * @email HeJieLin@lvtumall.com
 * @date 2020-05-22 19:00:18
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

