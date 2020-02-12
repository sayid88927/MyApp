package com.app.service.impl;

import com.app.mapper.TGrilimgsMapper;
import com.app.mapper.TImgurlMapper;
import com.app.model.TGrilimgs;
import com.app.model.TImgurl;
import com.app.model.TImgurlExample;
import com.app.service.CarouselsService;
import com.app.service.TimgurService;
import com.app.vo.ImgurlVo;
import com.bben.common.util.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "TimgurService")
public class TimgurServiceImpl implements TimgurService {

    @Autowired
    private TImgurlMapper tImgurlMapper;

    @Override
    public List<ImgurlVo> selectByPrimaryKey(Integer Id) {
        if (U.isBlank(Id)) {
            return null;
        }
        TImgurlExample tImgurlExample = new TImgurlExample();
        tImgurlExample.setOrderByClause("img_url");
        TImgurlExample.Criteria criteria = tImgurlExample.createCriteria();
        criteria.andGrilIdEqualTo(Id);
        List<TImgurl> tImgurl = tImgurlMapper.selectByExample(tImgurlExample);
        if (U.isBlank(tImgurl)) {
            return null;
        }
        return ImgurlVo.assemblyDataList(tImgurl);
    }



}
