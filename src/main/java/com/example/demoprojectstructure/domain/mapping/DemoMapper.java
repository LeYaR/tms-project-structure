package com.example.demoprojectstructure.domain.mapping;

import com.example.demoprojectstructure.domain.dbo.DemoEntity;
import com.example.demoprojectstructure.domain.dto.Demo;
import org.springframework.stereotype.Component;

@Component
public class DemoMapper {

    public Demo fromDbo(DemoEntity entity) {
        final Demo demo = new Demo();
        demo.setField(entity.getField());
        return demo;
    }

    public DemoEntity toDbo(Demo dto) {
        return new DemoEntity();
    }
}
