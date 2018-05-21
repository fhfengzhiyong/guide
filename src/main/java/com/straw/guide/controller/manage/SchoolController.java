package com.straw.guide.controller.manage;

import com.straw.guide.common.Page;
import com.straw.guide.common.Result;
import com.straw.guide.model.SchoolEntity;
import com.straw.guide.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String index() {
        return "manage/school/list";
    }

    @PostMapping("list")
    @ResponseBody
    public Result list(HttpServletRequest request, int page, int limit) {
        Map<String, String> map = new HashMap<>();
        Result result = null;
        Page<SchoolEntity> pageList = schoolService.queryByParams(map, page, limit);
        result = Result.success(pageList);
        return result;
    }
}
