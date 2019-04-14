package com.alibaba.springboot.controller.page;

import com.alibaba.springboot.controller.base.PageController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jingye
 * @className PersonPageController
 * @description Person的页面控制类
 * @date 2019/4/14 22:13
 */
@Controller
public class PersonPageController extends PageController {
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
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>(2);
        map.put("name", "景业");
        map.put("gender", "男");
        list.add(map);
        model.addAttribute("singlePerson","single");
        model.addAttribute("people",list);
        return "index";
    }
}
