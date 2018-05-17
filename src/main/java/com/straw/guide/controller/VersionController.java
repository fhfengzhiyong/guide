package com.straw.guide.controller;

import com.straw.guide.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@RestController
@RequestMapping("version")
public class VersionController {

    @Autowired
    VersionService versionService;
    public void index(){

    }
}
