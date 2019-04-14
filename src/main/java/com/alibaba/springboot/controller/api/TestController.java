package com.alibaba.springboot.controller.api;

import com.alibaba.springboot.bean.Test;
import com.alibaba.springboot.controller.base.ApiController;
import com.alibaba.springboot.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jingye
 * @className StudyController
 * @description 操作MongoDB中的test
 * @date 2019/4/14 22:03
 */
@RestController
public class TestController extends ApiController {

    @Autowired
    TestRepository testRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/saveTest")
    public Test save() {
        Test test = new Test("标题", "哈哈", "http://www.baidu.com", 100);
        List<String> list = new ArrayList<>();
        list.add("科目一");
        list.add("科目二");
        list.add("科目三");
        test.setTags(list);
        return testRepository.save(test);
    }

    @RequestMapping("/findByTitle")
    public Test findByTitle(String title) {
        return testRepository.findByTitle(title);
    }

    @RequestMapping("/findByLikes")
    public List<Test> findByLikes(Integer likes) {
        return testRepository.withQueryFindByLikes(likes);
    }

    @RequestMapping("/findAll")
    public List<Test> findAll() {
        return testRepository.findAll();
    }

    @RequestMapping("/find")
    public Test find(Test bean) {
        Query query = new Query(Criteria.where("id").is(bean.getId()));
        return mongoTemplate.findOne(query, Test.class);
    }
}

