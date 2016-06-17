package com.walden.dao;

import com.walden.entity.OrderEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by walden on 16/6/13.
 */
@Component
@Transactional
public interface OrderDao {

    @Insert("INSERT INTO `goTurf`.`order` (`order_id`,`owner`, `customer_name`, `customer_contact`, `turf_varity`, `turf_quanutity`, `cutter`, `driver`, `layer`, " +
            "`total_price`, `address_detail`, `delivery_date_time`, `submitted_date_time`, `order_status`, `customer_email`,`last_modified`,`modifier`,`turf_type`,`is_delete`) " +
            "VALUES (#{orderEntity.order_id},#{orderEntity.owner}, #{orderEntity.customer_name}, #{orderEntity.customer_contact},#{orderEntity.turf_varity}, #{orderEntity.turf_quanutity}, #{orderEntity.cutter}, #{orderEntity.driver}, #{orderEntity.layer}, #{orderEntity.total_price}, #{orderEntity.address_detail}, " +
            "#{orderEntity.delivery_date_time}, #{orderEntity.submitted_date_time}, #{orderEntity.order_status}, #{orderEntity.customer_email}, #{orderEntity.last_modified}, #{orderEntity.modifier}, #{orderEntity.turf_type}, #{orderEntity.is_delete})")
    void insertInto(@Param(value = "orderEntity") OrderEntity orderEntity);

    @Select("SELECT * FROM goTurf.`order`")
    List<OrderEntity> selectOrders();

    @Select("SELECT * FROM goTurf.`order` where order_id = #{orderid}")
    List<OrderEntity> selectById(String orderid);

    @Update("UPDATE `goTurf`.`order` SET `is_delete`='1' WHERE `order_id`=#{orderid}")
    void deleteOrderBy(String orderid);

    @Update("UPDATE `goTurf`.`order` SET `owner`=#{orderEntity.owner},`customer_name`=#{orderEntity.customer_name},`customer_contact`=#{orderEntity.customer_contact},`turf_varity`=#{orderEntity.turf_varity}," +
            "`turf_quanutity`=#{orderEntity.turf_quanutity},`cutter`=#{orderEntity.cutter},`driver`=#{orderEntity.driver},`layer`=#{orderEntity.layer},`total_price`=#{orderEntity.total_price},`address_detail`=#{orderEntity.address_detail},`delivery_date_time`=#{orderEntity.delivery_date_time}," +
            "`submitted_date_time`=#{orderEntity.submitted_date_time},`order_status`=#{orderEntity.order_status},`customer_email`=#{orderEntity.customer_email},`last_modified`=#{orderEntity.last_modified},`modifier`=#{orderEntity.modifier},`turf_type`=#{orderEntity.turf_type} WHERE `order_id`=#{orderid}")
    void updateOrder(@Param(value = "orderEntity")OrderEntity orderEntity);
}
