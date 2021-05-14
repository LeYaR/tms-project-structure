package com.example.demoprojectstructure.controller;

import com.example.demoprojectstructure.domain.dto.Demo;
import com.example.demoprojectstructure.service.DemoServiceInterface;

public class DemoController implements DemoControllerInterface {

    private final DemoServiceInterface service;

    public DemoController(DemoServiceInterface service) {
        this.service = service;
    }

    @Override
    public Demo getDemoByField(String field) {
        return service.getDemoByField(field);
    }
}
