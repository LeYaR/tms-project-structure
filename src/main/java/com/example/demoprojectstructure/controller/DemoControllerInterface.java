package com.example.demoprojectstructure.controller;

import com.example.demoprojectstructure.domain.dto.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public interface DemoControllerInterface {

    @GetMapping
    Demo getDemoByField(String field);
}
