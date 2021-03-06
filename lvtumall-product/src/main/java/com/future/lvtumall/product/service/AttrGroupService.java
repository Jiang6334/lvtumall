package com.future.lvtumall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.common.utils.PageUtils;
import com.future.lvtumall.product.entity.AttrGroupEntity;
import com.future.lvtumall.product.vo.AttrGroupWithAttrsVo;
import com.future.lvtumall.product.vo.SpuItemAttrGroupVo;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author aya
 * @email HeJieLin@lvtumall.com
 * @date 2020-05-22 19:00:18
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    List<AttrGroupWithAttrsVo> getAttrGroupWithAttrsByCatelogId(Long catelogId);

    List<SpuItemAttrGroupVo> getAttrGroupWithAttrsBySpuId(Long spuId, Long catalogId);
}

