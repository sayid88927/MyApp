package com.app.service;

import com.app.model.TGrilimgs;
import com.app.model.TToolbar;
import com.app.vo.GrilimgsVo;
import com.bben.common.PageInfo;

import java.util.List;

public interface GrilImgsService {

    List<GrilimgsVo>   findAll();

    PageInfo<GrilimgsVo> getTBedVoByCondition(int pageNum, int pageSize);
    /**
     * 根据主键查询信息
     * @param Id
     * @return
     */
    List<GrilimgsVo> selectByTagId(String Id);
}
