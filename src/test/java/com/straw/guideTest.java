package com.straw;

import com.straw.guide.model.VersionEntity;
import com.straw.guide.repository.VersionRepository;
import com.straw.guide.service.VersionService;
import junit.runner.Version;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.straw.guide.Application;

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
    @Test
    public void t() {
        Iterable<VersionEntity> all = versionRepository.findAll();
        all.forEach((k) -> System.out.println(k.getName()));
        all.forEach((k) -> System.out.println(k.getName()));
    }
}
