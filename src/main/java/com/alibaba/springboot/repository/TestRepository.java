package com.alibaba.springboot.repository;

import com.alibaba.springboot.bean.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @author jingye
 * @className TestRepository
 * @description MongoDB仓库
 * @date 2019/4/14 21:58
 */
public interface TestRepository extends MongoRepository<Test, String> {
    Test findByTitle(String title);

    @Query("{'likes': ?50}")
    List<Test> withQueryFindByLikes(Integer likes);
}
