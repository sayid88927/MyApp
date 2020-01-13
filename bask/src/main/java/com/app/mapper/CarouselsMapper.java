package com.app.mapper;

import com.app.model.Carousels;
import com.app.model.CarouselsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarouselsMapper {
    long countByExample(CarouselsExample example);

    int deleteByExample(CarouselsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Carousels record);

    int insertSelective(Carousels record);

    List<Carousels> selectByExample(CarouselsExample example);

    Carousels selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Carousels record, @Param("example") CarouselsExample example);

    int updateByExample(@Param("record") Carousels record, @Param("example") CarouselsExample example);

    int updateByPrimaryKeySelective(Carousels record);

    int updateByPrimaryKey(Carousels record);
}