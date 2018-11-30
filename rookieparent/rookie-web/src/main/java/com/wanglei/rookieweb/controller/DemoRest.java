package com.wanglei.rookieweb.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Api("测试swagger能否启动")
public class DemoRest {

    @ApiOperation(value = "第一个测试方法", notes = "终于能看到了！", httpMethod = "POST", produces = "application/json", consumes = "application/json")
//    @ApiResponse(code = 200, message = "返回成功", response = String.class)
    @PostMapping(value = "/getstring", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String getString(@RequestParam String name) {
        System.out.println(name);
        return "hello " + name;
    }

}
