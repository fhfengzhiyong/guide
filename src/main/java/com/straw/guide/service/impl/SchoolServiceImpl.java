package com.straw.guide.service.impl;

import com.straw.guide.repository.AdmissionCriteriaEntityRepository;
import com.straw.guide.repository.SchoolRepository;
import com.straw.guide.repository.SchoolStandardRepository;
import com.straw.guide.repository.SpecialtyRepository;
import com.straw.guide.service.SchoolService;
import com.straw.guide.utils.tmp.ScoreInfo;
import org.hibernate.validator.constraints.pl.REGON;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/17/2018
 */
public class SchoolServiceImpl implements SchoolService {
    @Resource
    AdmissionCriteriaEntityRepository admissionCriteriaEntityRepository;
    @Resource
    SchoolRepository schoolRepository;
    @Resource
    SchoolStandardRepository schoolStandardRepository;
    @Resource
    SpecialtyRepository specialtyRepository;

    @Override
    public void importData(List<ScoreInfo> temp) {
        if (temp == null || temp.size() == 0) {
            return;
        }
        for (int index = 0; index < temp.size(); index++) {
            ScoreInfo scoreInfo = temp.get(index);
            schoolRepository.findBySchoolName(scoreInfo.getYxmc())
        }
    }
}
