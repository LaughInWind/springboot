package com.alibaba.springboot.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author jingye
 * @className Test
 * @description MongoDB测试
 * @date 2019/4/14 21:52
 */
@Document
public class Test {
    @Id
    private String id;
    private String title;
    private String by;
    private String url;
    private List<String> tags;
    private Integer likes;

    public Test() {}

    public Test(String title, String by, String url, Integer likes) {
        this.title = title;
        this.by = by;
        this.url = url;
        this.likes = likes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
