package com.future.lvtumall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.common.utils.PageUtils;
import com.future.lvtumall.ware.entity.PurchaseEntity;
import com.future.lvtumall.ware.vo.MergeVo;
import com.future.lvtumall.ware.vo.PurchaseDoneVo;

import java.util.List;
import java.util.Map;

/**
 * 采购信息
 *
 * @author aya
 * @email HeJieLin@lvtumall.com
 * @date 2020-05-22 19:55:33
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询未领取的采购单
     * @param params
     * @return
     */
    PageUtils queryPageUnreceive(Map<String, Object> params);

    /**
     * 合并采购需求
     * @param mergeVo
     */
    void mergePurchase(MergeVo mergeVo);

    /**
     * 领取采购单
     * @param ids
     */
    void received(List<Long> ids);

    /**
     * 完成采购单
     * @param doneVo
     */
    void done(PurchaseDoneVo doneVo);
}

