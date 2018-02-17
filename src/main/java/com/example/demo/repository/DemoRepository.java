package com.example.demo.repository;

import com.example.demo.database.Database;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DemoRepository {

    private Database db;

    public DemoRepository(Database db) {
        this.db = db;
    }

    public List<String> findAll() {
        return db.findAll();
    }
}
