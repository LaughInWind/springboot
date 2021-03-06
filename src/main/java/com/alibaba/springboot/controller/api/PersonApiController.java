package com.alibaba.springboot.controller.api;

import com.alibaba.springboot.bean.Person;
import com.alibaba.springboot.controller.base.ApiController;
import com.alibaba.springboot.jpa.PersonJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jingye
 * @className PersonApiController
 * @description Person的控制类
 * @date 2019/4/14 22:11
 */
@RestController
public class PersonApiController extends ApiController {
    @Autowired
    private PersonJPA personJPA;
    /**
     * @description 获取用户
     * @author jingye
     * @date 2019-04-13 21:26:35
     * @method getPerson
     * @param
     * @return java.util.List<com.alibaba.springboot.bean.Person>
     */
    @RequestMapping(value = "/getPerson", method = RequestMethod.GET)
    public List<Person> getPerson() {
        return personJPA.findAll();
    }

    /**
     * @description 通过ID获取人员
     * @author jingye
     * @date 2019-04-13 23:21:49
     * @method getPersonById
     * @param id
     * @return com.alibaba.springboot.bean.Person
     */
    @RequestMapping(value = "/getPersonById", method = RequestMethod.GET)
    public Person getPersonById(Long id) {
        return personJPA.getOne(id);
    }
}
