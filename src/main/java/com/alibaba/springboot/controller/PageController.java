package com.alibaba.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingye
 * @className PageController
 * @description 页面Controller
 * @date 2019/4/13 21:24
 */
@Controller
@RequestMapping("/")
public class PageController {
    /**
     * @description 方法描述
     * @author jingye
     * @date 2019-04-13 21:25:42
     * @method index
     * @param model
     * @return java.lang.String
     */
    @RequestMapping(value = "/getPerson", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("singlePerson","single");
        model.addAttribute("people","people");
        return "index";
    }
}
