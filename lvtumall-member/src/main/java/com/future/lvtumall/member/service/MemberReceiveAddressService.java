package com.future.lvtumall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.future.common.utils.PageUtils;
import com.future.lvtumall.member.entity.MemberReceiveAddressEntity;

import java.util.List;
import java.util.Map;

/**
 * 会员收货地址
 *
 * @author aya
 * @email HeJieLin@lvtumall.com
 * @date 2020-05-22 19:42:06
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<MemberReceiveAddressEntity> getAddress(Long memberId);
}

