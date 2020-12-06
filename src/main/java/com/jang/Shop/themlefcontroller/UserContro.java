package com.jang.Shop.themlefcontroller;
import com.jang.Shop.config.JsonResult;
import com.jang.Shop.entity.User;
import com.jang.Shop.mapper.UserMapper;
import com.jang.Shop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
@Controller

@Api(tags = "用户接口")
public class UserContro {
    @Autowired
    private UserService userService;
    @Autowired
    public UserMapper userMapper;

    public User user;

    @ApiOperation("接口")
    @RequestMapping("/index")
    public String register() {
        return "index";
    }

}
