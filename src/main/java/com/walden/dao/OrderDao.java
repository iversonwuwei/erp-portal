package com.walden.dao;

import com.walden.entity.OrderEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/6/13.
 */
@Component
public interface OrderDao {

    @Insert("INSERT INTO `goTurf`.`order` (`order_id`,`owner`, `customer_name`, `customer_contact`, `turf_varity`, `turf_quanutity`, `cutter`, `driver`, `layer`, `total_price`, `address_detail`, `delivery_date_time`, `submmited_date_time`, `order_status`, `customer_email`) " +
            "VALUES (#{orderEntity.order_id},'walden', 'walden', '123456', '12', '23', 'walden', 'walden', 'wadeln', '123', 'qweqweqeqwe', '2016', '2017', 'in progress', 'iverson.wuwei@gmail.com')")
    void insertInto(@Param(value = "orderEntity") OrderEntity orderEntity);

    @Select("SELECT * FROM goTurf.`order`")
    List<OrderEntity> selectOrders();

    @Select("SELECT * FROM goTurf.`order` where order_id = #{orderid}")
    List<OrderEntity> selectById(String orderid);
}
