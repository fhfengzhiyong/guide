package com.straw.guide.service;

import com.straw.guide.model.SchoolEntity;
import com.straw.guide.utils.tmp.ScoreInfo;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/17/2018
 */
public interface SchoolService {
    /**
     * 导入数据
     *
     * @param temp
     */
    void importData(List<ScoreInfo> temp);

    /**
     * 根据map种存储条件查询
     *
     * @param map
     * @return
     */
    Page<SchoolEntity> queryByParams(Map<String, String> map);
}
