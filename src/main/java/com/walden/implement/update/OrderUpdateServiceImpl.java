package com.walden.implement.update;

import com.walden.dao.ui.OrderDao;
import com.walden.entity.OrderEntity;
import com.walden.service.database.IUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/6/16.
 */
@Service
public class OrderUpdateServiceImpl implements IUpdateService {

    @Autowired
    private OrderDao orderDao;
    private OrderEntity orderEntity;

    public void update(Object entity) {
        orderEntity = (OrderEntity) entity;
        orderDao.updateOrder(orderEntity);
    }
}
