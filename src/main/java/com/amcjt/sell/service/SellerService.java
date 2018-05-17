package com.amcjt.sell.service;

import com.amcjt.sell.domain.SellerInfo;
import org.springframework.stereotype.Service;

/**
 * @author jbhim
 * @date 2018/5/11/011.
 */
public interface SellerService {

    /**通过openid查询
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
