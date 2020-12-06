package com.jang.Shop.controller;


import com.jang.Shop.config.JsonResult;
import com.jang.Shop.entity.User;
import com.jang.Shop.mapper.UserMapper;
import com.jang.Shop.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 狂神说
 * @since 2020-12-03
 */
@RestController
@RequestMapping("/Shop/user")
@Api(tags = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    public UserMapper userMapper;

    public User user;


//    @ApiOperation("用户注册接口")
//    @PostMapping("/register")
//    public int register(@RequestBody User user){
//        userService.save(user);
//        return 1;
//    }

    @ApiOperation("用户注册接口")
    @PostMapping("/register")
    public JsonResult<List> register(@RequestBody User user) {
        userService.save(user);
        return new JsonResult<>();
    }


    @ApiOperation("用户登录接口")
    @PostMapping("/login")
    public boolean login(@RequestBody User user) {
        //条件查询
        HashMap<String, Object> map = new HashMap<>();
//        map.put("name", name);
//        map.put("pwd", pwd);
        List<User> list = userMapper.selectByMap(map);
        if (list.isEmpty())  //等同于查询
        {
            return false;
        }
        return true;
    }



    @ApiOperation("用户信息修改接口")
    @PostMapping("/updateinfo")
    public int updateinfo(@RequestBody User user){
        userMapper.updateById(user);
        return 1;
    }

    @ApiOperation("所有用户信息查询")
    @PostMapping("/selectall")
    public List<User> finAll(){
        //查询所有
        List<User> users = userMapper.selectList(null);
        return users;
    }

    @ApiOperation("通过id查询用户信息查询")
    @PostMapping("/selectbyid")
    public JsonResult<List> selectbyid(@RequestBody int id){
        //查询所有
        List users = Collections.singletonList(userMapper.selectById(id));
        return new JsonResult<>(users,"huoqi");
    }

    @ApiOperation("通过id删除用户信息查询")
    @PostMapping("/deletebyid")
    public String deletebyid(@RequestBody int id){
        //通过id查询
        int users = userMapper.deleteById(id);
        return "用户id删除成功";
    }

    @ApiOperation("多条件查询用户信息查询")
    @PostMapping("/selectbymatch/{id}/{name}")
    public List<User> selectbyid(@PathVariable  @ApiParam(value="唯一") int id, @PathVariable String name){
        //条件查询
        HashMap<String,Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        List<User> users = userMapper.selectByMap(map);
        return users;
    }




}

