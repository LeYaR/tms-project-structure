package com.example.demoprojectstructure.domain.dbo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class DemoEntity {
    @Id
    private String id;
    private String field;
}
