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

        //插入日期Date
        Date date = new Date();
        System.err.println(date);
        dto.setDate(date);

        //插入日期String
        String str = "2022-07-03 00:00:01";
        System.err.println(str);
        dto.setTime(str);

        testMapper.insert(dto);
    }
}
