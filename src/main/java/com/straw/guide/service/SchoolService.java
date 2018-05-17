package com.straw.guide.service;

import com.straw.guide.utils.tmp.ScoreInfo;

import java.util.List;

/**
 * @author straw(fengzy)
 * @description
 * @date 5/17/2018
 */
public interface SchoolService {
    void importData(List<ScoreInfo> temp);
}
