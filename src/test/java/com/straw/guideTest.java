package com.straw;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.straw.guide.Application;
import com.straw.guide.mapper.SchoolEntityMapper;
import com.straw.guide.model.SchoolEntity;
import com.straw.guide.model.VersionEntity;
import com.straw.guide.repository.VersionRepository;
import com.straw.guide.service.VersionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/14/2018
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class guideTest {
    @Autowired
    VersionService versionService;
    @Autowired
    VersionRepository versionRepository;
    @Autowired
    SchoolEntityMapper schoolEntityMapper;
    @Test
    public void t() {
        Iterable<VersionEntity> all = versionRepository.findAll();
        all.forEach((k) -> System.out.println(k.getName()));
        all.forEach((k) -> System.out.println(k.getName()));
    }
    @Test
    public void test1(){
        Optional<VersionEntity> entity = versionRepository.findById("1");
        System.out.println(entity.get().getName());
    }
    @Test
    public void test2(){
        SchoolEntity select = schoolEntityMapper.selectByPrimaryKey("020c9414-35e9-410e-a131-8afabfae52dc");
        System.out.println(select.getSchoolName());
    }
    @Test
    public void test3(){
        Map<String, String> map = new HashMap<>();
        PageHelper.startPage(1, 10);
        List<SchoolEntity> list = schoolEntityMapper.queryByParams(map);
        System.out.println(((Page)list).getTotal());
    }
}
