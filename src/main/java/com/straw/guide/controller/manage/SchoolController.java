package com.straw.guide.controller.manage;

import com.straw.guide.common.Result;
import com.straw.guide.model.SchoolEntity;
import com.straw.guide.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author straw(fengzy)
 * @description
 * @date {DATE}
 */
@Controller
@RequestMapping("school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;
    @GetMapping("index")
    public String index(){
        return "school";
    }
    @PostMapping("list")
    public void list(HttpServletRequest request){
        Map<String, String> map = new HashMap<>();
        Result result = new Result();
        Page<SchoolEntity> page = schoolService.queryByParams(map);

    }
}
