package com.alibaba.springboot.jpa;

import com.alibaba.springboot.bean.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author jingye
 * @className PersonJPA
 * @description 人员表JPA接口
 * @date 2019/4/13 22:37
 * SpringDataJPA提供的简单数据操作接口）、JpaSpecificationExecutor（SpringDataJPA提供的复杂查询接口）、Serializable（序列化接口
 */
public interface PersonJPA extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person>, Serializable {
}
