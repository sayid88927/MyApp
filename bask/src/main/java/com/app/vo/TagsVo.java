package com.app.vo;

import com.app.model.TImgurl;
import com.app.model.TTag;
import com.bben.common.util.JsonUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TagsVo {

    private String tag;
    private String tagid;
    private Integer id;
    public static TagsVo assemblyData(TTag tTag){
            return JsonUtil.convert(tTag,TagsVo.class);
    }

    public static List<TagsVo> assemblyDataList(List<TTag> tTagList){
        return JsonUtil.convertList(tTagList,TagsVo.class);
    }

}
