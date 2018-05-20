package com.straw.guide.mapper;

import com.straw.guide.model.SchoolEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;

import java.util.Map;

@Mapper
public interface SchoolEntityMapper {
    int deleteByPrimaryKey(String id);

    int insert(SchoolEntity record);

    int insertSelective(SchoolEntity record);

    SchoolEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SchoolEntity record);

    int updateByPrimaryKeyWithBLOBs(SchoolEntity record);

    int updateByPrimaryKey(SchoolEntity record);

    /**
     * 根据map 属性查询分页
     * @param map
     * @return
     */
    Page<SchoolEntity> queryByParams(Map<String, String> map);
}