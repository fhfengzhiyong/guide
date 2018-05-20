package com.straw;

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
        SchoolEntity schoolEntity = schoolEntityMapper.selectByPrimaryKey("f1f25bbc-454c-4ec9-ab2f-f851784d273e");
        System.out.println(schoolEntity.getSchoolName());
    }
}
