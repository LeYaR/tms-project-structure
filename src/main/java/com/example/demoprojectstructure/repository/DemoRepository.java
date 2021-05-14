package com.example.demoprojectstructure.repository;

import com.example.demoprojectstructure.domain.dbo.DemoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemoRepository extends CrudRepository<DemoEntity, String> {

    Optional<DemoEntity> findByField(String field);
}
