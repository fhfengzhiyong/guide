package com.straw.guide.service.impl;

import com.straw.guide.model.SchoolEntity;
import com.straw.guide.model.SpecialtyEntity;
import com.straw.guide.repository.AdmissionCriteriaEntityRepository;
import com.straw.guide.repository.SchoolRepository;
import com.straw.guide.repository.SchoolStandardRepository;
import com.straw.guide.repository.SpecialtyRepository;
import com.straw.guide.service.SchoolService;
import com.straw.guide.utils.tmp.ScoreInfo;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.pl.REGON;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

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
            ScoreInfo info = temp.get(index);
            //确定学校是否存在
            SchoolEntity schoolEntity = schoolRepository.findBySchoolName(info.getYxmc());
            if (schoolEntity == null){
                schoolEntity = new SchoolEntity();
                schoolEntity.setId(UUID.randomUUID().toString());
                schoolEntity.setSchoolName(info.getYxmc());
                schoolEntity.setRegion(info.getSfdl());
                schoolEntity.setProvince(info.getSf());
                schoolEntity.setStar(0);
                schoolRepository.save(schoolEntity);
            }
            //专业
           // SpecialtyEntity specialtyEntity
            //学科subject
            String xk = info.getXk();
            //category
            String zylb = info.getZylb();
            //zy 专业名称
            String zy = info.getZy();
            //科类type
            String zl = info.getZl();
            SpecialtyEntity specialtyEntity =  specialtyRepository.findByAttr(xk,zylb,zy,zl);

        }
    }
}
