package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /*
    * 批量插入数据*/
    void insertBatch(List<DishFlavor> flavors);

    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long id);

    /*
    * 根据菜品Id 集合删除关联数据*/
    void deleteByDishIds(List<Long> dishIds);


    /*
     * 根据菜品Id 查询口味数据
     * */
    @Select("select * from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
