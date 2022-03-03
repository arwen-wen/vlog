package com.arwen.vlog.dao;

import com.arwen.vlog.entity.GeneratorTest;

public interface GeneratorTestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GeneratorTest record);

    int insertSelective(GeneratorTest record);

    GeneratorTest selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GeneratorTest record);

    int updateByPrimaryKey(GeneratorTest record);
}