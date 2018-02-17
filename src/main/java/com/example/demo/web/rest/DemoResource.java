package com.example.demo.web.rest;

import com.example.demo.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class DemoResource {

    private DemoService demoService;

    public DemoResource(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("/demo")
    public List<String> getAll() {
        return demoService.findAll();
    }
}
