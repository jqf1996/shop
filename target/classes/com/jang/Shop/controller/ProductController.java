package com.jang.Shop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 狂神说
 * @since 2020-12-03
 */
@Controller
@RequestMapping("/Shop/product")
public class ProductController {
    @RequestMapping("1")
    public String register() {
        return "50";
    }
}

