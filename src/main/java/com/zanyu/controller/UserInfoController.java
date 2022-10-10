package com.zanyu.controller;



import com.zanyu.config.CommonResult;
import com.zanyu.entity.UserInfo;
import com.zanyu.service.UserInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;


    @PostMapping("/register")
    public CommonResult<Boolean> register(@RequestBody UserInfo userInfo) {
        return CommonResult.success(userInfoService.register(userInfo));
    }

    @PostMapping("/login")
    public CommonResult<String> login(@RequestBody UserInfo userInfo) {
        return CommonResult.success(userInfoService.login(userInfo));
    }

    @PostMapping("/changePassword")
    public CommonResult<Boolean> changePassword(@RequestBody UserInfo userInfo) {
        return CommonResult.success(userInfoService.changePassword(userInfo));
    }

}
