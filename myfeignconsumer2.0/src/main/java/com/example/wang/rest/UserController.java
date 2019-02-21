package com.example.wang.rest;

import com.example.wang.model.User;
import com.example.wang.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2019/2/21.
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户操作")
public class UserController {

    @Autowired
    private UserService userFeignService;

    /**
     * 用于演示Feign的Get请求多参数传递
     * @param user
     * @return
     */
    @ApiOperation(value = "添加用户")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser( @RequestBody @ApiParam(name="用户",value="传入json格式",required=true) User user){
        return userFeignService.addUser(user);
    }

    /**
     * 用于演示Feign的Post请求多参数传递
     * @param user
     * @return
     */
    @ApiOperation(value = "更新用户")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateUser( @RequestBody @ApiParam(name="用户",value="传入json格式",required=true) User user){
        return userFeignService.updateUser(user);
    }

}
