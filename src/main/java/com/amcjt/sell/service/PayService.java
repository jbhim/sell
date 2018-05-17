package com.amcjt.sell.service;

import com.amcjt.sell.dto.OrderDTO;

/**
 * @author jbhim
 * @date 2018/5/7/007.
 */
public interface PayService {
    /**orderDTO
     * @param orderDTO orderDTO
     */
    void create(OrderDTO orderDTO);
}
