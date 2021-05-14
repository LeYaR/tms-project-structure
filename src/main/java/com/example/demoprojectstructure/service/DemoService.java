package com.example.demoprojectstructure.service;

import com.example.demoprojectstructure.domain.dbo.DemoEntity;
import com.example.demoprojectstructure.domain.dto.Demo;
import com.example.demoprojectstructure.domain.mapping.DemoMapper;
import com.example.demoprojectstructure.exception.api.FieldNotFoundException;
import com.example.demoprojectstructure.repository.DemoRepository;
import org.springframework.stereotype.Service;

@Service
public class DemoService implements DemoServiceInterface {

    private final DemoRepository repository;
    private final DemoMapper mapper;

    public DemoService(DemoRepository repository, DemoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Demo getDemoByField(String field) {
        final DemoEntity demoEntity = repository.findByField(field).orElseThrow(FieldNotFoundException::new);

        return mapper.fromDbo(demoEntity);
    }
}
