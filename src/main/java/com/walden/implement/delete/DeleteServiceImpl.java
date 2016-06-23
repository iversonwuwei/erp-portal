package com.walden.implement.delete;

import com.walden.dao.ui.OrderDao;
import com.walden.service.database.IDeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/15.
 */
@Service
public class DeleteServiceImpl<OrderEntity> implements IDeleteService<OrderEntity> {


    @Autowired
    private OrderDao orderDao;

    public void deleteby(Object s) {
        orderDao.deleteOrderBy(String.valueOf(s));
    }

    public void deletelist(List<OrderEntity> objs) {

    }
}
