package com.app.vo;

import com.app.model.TGrilimgs;
import com.app.model.TImgurl;
import com.bben.common.util.JsonUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ImgurlVo {

    private Integer id;

    private String imgUrl;

    private Integer grilId;

    public static ImgurlVo assemblyData(TImgurl tImgurl){
        return JsonUtil.convert(tImgurl,ImgurlVo.class);
    }

    public static List<ImgurlVo> assemblyDataList(List<TImgurl> tImgurlList){
        return JsonUtil.convertList(tImgurlList,ImgurlVo.class);
    }



}
