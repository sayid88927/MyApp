package com.app.mapper;

import com.app.model.Toolbar;
import com.app.model.ToolbarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToolbarMapper {
    long countByExample(ToolbarExample example);

    int deleteByExample(ToolbarExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Toolbar record);

    int insertSelective(Toolbar record);

    List<Toolbar> selectByExample(ToolbarExample example);

    Toolbar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Toolbar record, @Param("example") ToolbarExample example);

    int updateByExample(@Param("record") Toolbar record, @Param("example") ToolbarExample example);

    int updateByPrimaryKeySelective(Toolbar record);

    int updateByPrimaryKey(Toolbar record);
}