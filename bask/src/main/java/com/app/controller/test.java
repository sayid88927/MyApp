package com.app.controller;

import com.bben.common.BaseController;
import com.bben.common.entity.vo.Result;
import com.bben.common.util.U;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/bed")
public class test extends BaseController {


    @GetMapping("/selectByBedId")
    public Result<String> selectByBedId(){

        return  Result.success("查询数据成功","查询数据成功");
    }

}
