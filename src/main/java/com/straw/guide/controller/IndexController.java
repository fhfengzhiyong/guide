package com.straw.guide.controller;

import com.straw.guide.model.UserEntity;
import com.straw.guide.model.VersionEntity;
import com.straw.guide.repository.UserRepository;
import com.straw.guide.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@RestController
public class IndexController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    VersionService versionService;
    @RequestMapping("/index")
    public  String Index(){
        Optional<UserEntity> user = userRepository.findById("1");
        System.out.println(user.get().getNickName());
        return "Hello!";
    }
}
