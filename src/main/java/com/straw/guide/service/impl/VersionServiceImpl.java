package com.straw.guide.service.impl;

import com.straw.guide.repository.VersionRepository;
import com.straw.guide.service.VersionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/13/2018
 */
@Service("versionService")
public class VersionServiceImpl  implements VersionService {
    @Resource
    VersionRepository versionRepository;
    public void test(){
        versionRepository.findById("");
    }
}
