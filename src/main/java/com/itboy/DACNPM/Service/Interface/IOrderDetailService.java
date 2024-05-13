package com.itboy.DACNPM.Service.Interface;


import com.itboy.DACNPM.dtos.OrderDetailDTO;
import com.itboy.DACNPM.exceptions.DataNotFoundException;
import com.itboy.DACNPM.models.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail createOrderDetail(OrderDetailDTO newOrderDetail) throws Exception;
    OrderDetail getOrderDetail(Long id) throws DataNotFoundException;
    OrderDetail updateOrderDetail(Long id, OrderDetailDTO newOrderDetailData)
            throws DataNotFoundException;
    void deleteById(Long id);
    List<OrderDetail> findByOrderId(Long orderId);


}
