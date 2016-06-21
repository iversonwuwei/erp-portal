package com.walden.helper;

import com.walden.common.IConverter;
import com.walden.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by walden on 16/6/14.
 */
@Component
public class ConvertHelper implements IConverter<OrderEntity> {

    private OrderEntity orderEntity;
    private StringBuilder sb;
    private static final String DATEFORMATE = "yyyyMMddHHmmss";
    @Autowired
    private DateTimerHelper dateTimerHelper;

    public ConvertHelper(){

    }

    public OrderEntity convert(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
        this.orderEntity.setOrder_id(OrderIdMaker());
        return this.orderEntity;
    }

    protected String OrderIdMaker(){
        sb = new StringBuilder();
        sb.append(orderEntity.getCustomer_name());
        sb.append(dateTimerHelper.dateFormat(DATEFORMATE));
        return sb.toString();
    }
}
