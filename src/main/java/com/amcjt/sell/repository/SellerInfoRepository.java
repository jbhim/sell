package com.amcjt.sell.repository;

import com.amcjt.sell.domain.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jbhim
 * @date 2018/6/11/011.
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String>{
    /**通过openid查询
     * @param openid
     * @return
     */
    SellerInfo findByOpenid(String openid);

}
