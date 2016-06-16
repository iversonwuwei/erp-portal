package com.walden.implement.select;

import com.walden.dao.OrderDao;
import com.walden.service.ISelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/14.
 */
@Service
@Qualifier(value = "orderSelectService")
public class OrderSelectServiceImpl<OrderEntity> implements ISelectService<OrderEntity> {

    @Autowired
    private OrderDao orderDao;
    private List<OrderEntity> orders;

    public List<OrderEntity> selectAll() {
        return (List<OrderEntity>) orderDao.selectOrders();
    }

    public List<OrderEntity> selectBy(String condition) {
        return (List<OrderEntity>) orderDao.selectById(condition);
    }
}
