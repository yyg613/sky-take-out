package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    void saveWithFlavor(DishDTO dishDTO);
     /*page 分页查询*/

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    void deleteBatch(List<Long> ids);

    /*根据id查询菜品和口味
    */
    DishVO getByIdWithFlavor(Long id);


    void updateWithFlavor(DishDTO dishDTO);

    List<Dish> list(Long categoryId);

}
