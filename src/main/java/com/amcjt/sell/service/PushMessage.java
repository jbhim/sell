package com.amcjt.sell.service;

import com.amcjt.sell.dto.OrderDTO;

/**
 * 推送消息
 * @author jbhim
 * @date 2018/6/12/012.
 */
public interface PushMessage {
    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus (OrderDTO orderDTO);

}
