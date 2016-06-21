package com.walden.implement.insert;

import com.walden.common.IConverter;
import com.walden.dao.ui.OrderDao;
import com.walden.entity.OrderEntity;
import com.walden.service.database.IInsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/6/13.
 */
@Service
public class InsertServiceImpl<OrderEntity> implements IInsertService<OrderEntity> {

    @Autowired
    private OrderDao orderDao;
    @Qualifier("convertHelper")
    @Autowired
    private IConverter convert;

    public void insert(OrderEntity orderEntity) {
        orderEntity = (OrderEntity) convert.convert(orderEntity);
        orderDao.insertInto((com.walden.entity.OrderEntity) orderEntity);
    }
}
