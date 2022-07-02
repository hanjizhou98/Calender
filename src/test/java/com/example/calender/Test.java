package com.example.calender;

import com.example.calender.dto.DateDto;
import com.example.calender.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class Test {

    @Autowired
    private TestMapper testMapper;

    @org.junit.jupiter.api.Test
    public void test(){
        DateDto dto = new DateDto();
        Date date = new Date();
        System.err.println(date);
        dto.setDate(date);
        testMapper.insert(dto);
    }
}
