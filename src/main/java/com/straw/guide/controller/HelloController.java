package com.straw.guide.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * @author straw(fengzy)
 * @description
 * @date {DATE}
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("执行");
        return "hello";
    }

    @RequestMapping("ui")
    public String ui() {
        return "ui";
    }

    @ResponseBody
    @RequestMapping("user")
    public Map<String, Object> user() {
        Map<String, Object> map = new HashMap<>();
        map.put("count", 1000);
        map.put("code", 0);
        map.put("msg", "hello");
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setCity("太原");
        user.setUsername("小五");
        user.setSex("男");
        user.setSign("世界每一个好人");
        user.setWealth("10000000");
        user.setClassify("没有");
        user.setScore("500");
        List<User> list = new ArrayList();
        list.add(user);
        map.put("data", list);
        return map;
    }
}

class User {
    private String id;
    private String username;
    private String sex;
    private String city;
    private String sign;
    private String experience;
    private String score;
    private String classify;
    private String wealth;
    private String right;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getWealth() {
        return wealth;
    }

    public void setWealth(String wealth) {
        this.wealth = wealth;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
}
