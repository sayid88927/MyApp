package com.app.service;

import com.app.model.TImgurl;
import com.app.vo.ImgurlVo;

import java.util.List;

public interface TimgurService {



    /**
     * 根据主键查询信息
     * @param Id
     * @return
     */
    List<ImgurlVo> selectByPrimaryKey(Integer Id);



}
