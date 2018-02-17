package com.example.demo.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DemoMapper {

    @Select("SELECT demo FROM demos")
    List<String> findAll();
}
