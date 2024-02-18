package com.udacity.jdnd.course1;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DeliveryMapper {
    @Select("SELECT * FROM Delivery WHERE id = #{id}")
    Delivery getUser(int id);
    @Insert("INSERT INTO Delivery (orderId, time) " +
            "VALUES(#{orderId}, #{time})")
    Integer addDelivery(Delivery delivery);
    @Delete("DELETE FROM Delivery WHERE id = #{id}")
    void deleteDelivery(int id);

}