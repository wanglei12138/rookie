package com.wanglei.rookieweb.controller;

import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Api("测试swagger能否启动")
public class DemoRest {

    @ResponseBody
    @ApiOperation(value = "第一个测试方法", notes = "终于能看到了！", httpMethod = "POST", response = String.class)
    @ApiResponses({@ApiResponse(code = 200, message = "返回成功", response = String.class)})
    @PostMapping(value = "/getstring")
    @ApiImplicitParam(name = "name", value = "姓名", dataType = "String", paramType = "query", required = true)
    public String getString(@RequestParam @ApiParam(value = "姓名", required = true) String name) {
        System.out.println(name);
        try {
            return "hello " + name;
        } catch (Exception e) {
            System.out.print(e + " : " + e.getMessage());
            return "erroreeee";
        }
    }

    @ApiOperation(value = "测试返回值展示", notes = "返回值呀！！！", httpMethod = "GET")
    @GetMapping(value = "getstring1")
    public String getString() {
        System.out.print("传入成功");
        return "SUCCESSssss";
    }
}
