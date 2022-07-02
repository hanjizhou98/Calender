package com.example.calender.mapper;

import com.example.calender.dto.DateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {

    void insert(@Param("dto") DateDto dto);

}
