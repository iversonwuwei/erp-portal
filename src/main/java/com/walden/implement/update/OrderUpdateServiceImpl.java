package com.walden.implement.update;

import com.walden.dao.OrderDao;
import com.walden.entity.OrderEntity;
import com.walden.service.IUpdateService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by walden on 16/6/16.
 */
public class OrderUpdateServiceImpl implements IUpdateService {

    @Autowired
    private OrderDao orderDao;
    private OrderEntity orderEntity;

    public void update(Object entity) {
        orderEntity = (OrderEntity) entity;
        orderDao.updateOrder(orderEntity);
    }
}
