package com.future.lvtumall.ware.vo;

import lombok.Data;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: aya
 * @createTime: 2020-06-01 20:34
 **/

@Data
public class PurchaseItemDoneVo {

    private Long itemId;

    private Integer status;

    private String reason;

}
