package com.straw.guide.service.impl;

import com.straw.guide.mapper.SchoolEntityMapper;
import com.straw.guide.model.AdmissionCriteriaEntity;
import com.straw.guide.model.SchoolEntity;
import com.straw.guide.model.SchoolStandardEntity;
import com.straw.guide.model.SpecialtyEntity;
import com.straw.guide.repository.*;
import com.straw.guide.service.SchoolService;
import com.straw.guide.utils.tmp.ScoreInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/17/2018
 */
@Service("schoolService")
public class SchoolServiceImpl implements SchoolService {
    @Resource
    SchoolRepository schoolRepository;
    @Resource
    SchoolStandardRepository schoolStandardRepository;
    @Resource
    SpecialtyRepository specialtyRepository;

    @Resource
    AdmissionCriteriaRepository admissionCriteriaRepository;

    @Resource
    SchoolEntityMapper schoolEntityMapper;

    @Override
    public void importData(List<ScoreInfo> temp) {
        specialtyRepository.deleteAll();
        schoolStandardRepository.deleteAll();
        schoolRepository.deleteAll();
        admissionCriteriaRepository.deleteAll();
        if (temp == null || temp.size() == 0) {
            return;
        }
        for (int index = 0; index < temp.size(); index++) {
            ScoreInfo info = temp.get(index);
            //确定学校是否存在
            SchoolEntity schoolEntity = schoolRepository.findBySchoolName(info.getYxmc());
            if (schoolEntity == null) {
                schoolEntity = new SchoolEntity();
                schoolEntity.setId(UUID.randomUUID().toString());
                schoolEntity.setSchoolName(info.getYxmc());
                schoolEntity.setRegion(info.getSfdl());
                schoolEntity.setProvince(info.getSf());
                schoolEntity.setCity(info.getCs());
                schoolEntity.setStar(0);
                if (StringUtils.isEmpty(info.getXxcc())) {
                    schoolEntity.setLevel("其他");
                } else {
                    schoolEntity.setLevel(info.getXxcc());
                }
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
            SpecialtyEntity specialtyEntity = specialtyRepository.findByAttr(schoolEntity.getId(), xk, zylb, zy, zl);
            if (specialtyEntity == null) {
                specialtyEntity = new SpecialtyEntity();
                specialtyEntity.setId(UUID.randomUUID().toString());
                specialtyEntity.setSubject(xk);
                specialtyEntity.setCategory(zylb);
                specialtyEntity.setSpecialtyName(zy);
                specialtyEntity.setType(zl);
                specialtyEntity.setSchoolId(schoolEntity.getId());
                specialtyRepository.save(specialtyEntity);
            }
            //2017学校标准
            SchoolStandardEntity schoolStandard = schoolStandardRepository.findAttr(schoolEntity.getId(), "2017");
            if (schoolStandard == null) {
                schoolStandard = new SchoolStandardEntity();
                schoolStandard.setId(UUID.randomUUID().toString());
                schoolStandard.setYear(2017);
                schoolStandard.setSchoolId(schoolEntity.getId());
                schoolStandard.setHeadCount(info.getZszrs() == null ? 0 : info.getZszrs().intValue());
                schoolStandardRepository.save(schoolStandard);
            }
            //2016学校标准
            SchoolStandardEntity schoolStandard2016 = schoolStandardRepository.findAttr(schoolEntity.getId(), "2016");
            if (schoolStandard2016 == null) {
                schoolStandard2016 = new SchoolStandardEntity();
                schoolStandard2016.setId(UUID.randomUUID().toString());
                schoolStandard2016.setYear(2016);
                schoolStandard2016.setSchoolId(schoolEntity.getId());
                schoolStandard2016.setLowestScore(info.getXxzdf() == null ? 0 : info.getXxzdf().intValue());
                schoolStandardRepository.save(schoolStandard2016);
            }
            //导入历年招收情况
            //由专业、年份、批次确定
            AdmissionCriteriaEntity admissionCriteriaEntity2017 = admissionCriteriaRepository.findAttr(specialtyEntity.getId(), "2017", info.getPc());
            if (admissionCriteriaEntity2017 == null) {
                admissionCriteriaEntity2017 = new AdmissionCriteriaEntity();
                admissionCriteriaEntity2017.setId(UUID.randomUUID().toString());
                admissionCriteriaEntity2017.setBatch(info.getPc());
                admissionCriteriaEntity2017.setYear(2017);
                admissionCriteriaEntity2017.setSpecialtyId(specialtyEntity.getId());
                admissionCriteriaEntity2017.setHeadCount(info.getLqs2017() == null ? 0 : info.getLqs2017().intValue());
                admissionCriteriaEntity2017.setLowestSrore(info.getZyzdf2017() == null ? 0 : info.getZyzdf2017().intValue());
                admissionCriteriaRepository.save(admissionCriteriaEntity2017);
            }
            //2016
            AdmissionCriteriaEntity admissionCriteriaEntity2016 = admissionCriteriaRepository.findAttr(specialtyEntity.getId(), "2016", info.getPc());
            if (admissionCriteriaEntity2016 == null) {
                admissionCriteriaEntity2016 = new AdmissionCriteriaEntity();
                admissionCriteriaEntity2016.setId(UUID.randomUUID().toString());
                admissionCriteriaEntity2016.setBatch(info.getPc());
                admissionCriteriaEntity2016.setYear(2016);
                admissionCriteriaEntity2016.setSpecialtyId(specialtyEntity.getId());
                admissionCriteriaEntity2016.setLowestSrore(info.getZyzdf2016() == null ? 0 : info.getZyzdf2016().intValue());
                admissionCriteriaRepository.save(admissionCriteriaEntity2016);
            }
            //2015
            AdmissionCriteriaEntity admissionCriteriaEntity2015 = admissionCriteriaRepository.findAttr(specialtyEntity.getId(), "2015", info.getPc());
            if (admissionCriteriaEntity2015 == null) {
                admissionCriteriaEntity2015 = new AdmissionCriteriaEntity();
                admissionCriteriaEntity2015.setId(UUID.randomUUID().toString());
                admissionCriteriaEntity2015.setBatch(info.getPc());
                admissionCriteriaEntity2015.setYear(2015);
                admissionCriteriaEntity2015.setSpecialtyId(specialtyEntity.getId());
                admissionCriteriaEntity2015.setLowestSrore(info.getZyzdf2015() == null ? 0 : info.getZyzdf2015().intValue());
                admissionCriteriaRepository.save(admissionCriteriaEntity2015);
            }
            //2014
            AdmissionCriteriaEntity admissionCriteriaEntity2014 = admissionCriteriaRepository.findAttr(specialtyEntity.getId(), "2014", info.getPc());
            if (admissionCriteriaEntity2014 == null) {
                admissionCriteriaEntity2014 = new AdmissionCriteriaEntity();
                admissionCriteriaEntity2014.setId(UUID.randomUUID().toString());
                admissionCriteriaEntity2014.setYear(2014);
                admissionCriteriaEntity2014.setBatch(info.getPc());
                admissionCriteriaEntity2014.setSpecialtyId(specialtyEntity.getId());
                admissionCriteriaEntity2014.setLowestSrore(info.getZyzdf2014() == null ? 0 : info.getZyzdf2014().intValue());
                admissionCriteriaRepository.save(admissionCriteriaEntity2014);
            }
        }
    }

    @Override
    public Page<SchoolEntity> queryByParams(Map<String, String> map) {
        //List schoolRepository.findByParams(map);
        Page<SchoolEntity> page = schoolEntityMapper.queryByParams(map);
        return null;
    }
}
