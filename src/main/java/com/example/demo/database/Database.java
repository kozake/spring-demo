package com.example.demo.database;

import com.example.demo.mapper.DemoMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Database {

    private SqlSession sqlSession;

    public Database(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<String> findAll() {
        DemoMapper mapper = sqlSession.getMapper(DemoMapper.class);
        return mapper.findAll();
    }
}
