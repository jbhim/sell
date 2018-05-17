package com.amcjt.sell.service;

import com.amcjt.sell.dto.OrderDTO;

/**
 * @author jbhim
 * @date 2018/5/5/005.
 */
public interface BuyerService {
    /**
     * 查询一个订单
     * @param openid openid
     * @param orderId openid
     * @return OrderDTO
     */
    OrderDTO findOrderOne (String openid, String orderId);

    /**
     * 取消订单
     * @param openid openid
     * @param orderId openid
     * @return OrderDTO
     */
    OrderDTO cancel (String openid, String orderId);


}
