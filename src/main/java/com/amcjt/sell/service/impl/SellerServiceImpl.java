package com.amcjt.sell.service.impl;

import com.amcjt.sell.domain.SellerInfo;
import com.amcjt.sell.repository.SellerInfoRepository;
import com.amcjt.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jbhim
 * @date 2018/6/11/011.
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;
    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        SellerInfo sellerInfo = repository.findByOpenid(openid);
        return sellerInfo;
    }
}
