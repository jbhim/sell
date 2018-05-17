package com.amcjt.sell.repository;

import com.amcjt.sell.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Administrator
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    /**
     * @param orderId order id
     * @return
     */
    List<OrderDetail> findByOrderId(String orderId);
}
