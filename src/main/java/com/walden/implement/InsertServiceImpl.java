package com.walden.implement;

import com.walden.dao.OrderDao;
import com.walden.service.IInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/6/13.
 */
@Service
public class InsertServiceImpl<OrderEntity> implements IInsertService<OrderEntity> {

    @Autowired
    private OrderDao orderDao;

    public void insert(OrderEntity orderEntity) {
        orderDao.insertInto((com.walden.entity.OrderEntity) orderEntity);
    }
}
