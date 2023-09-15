package com.example.test.repo;


import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;

import com.example.test.entity.TestEntity;

@Repository
public interface TestRepo extends JpaRepository<TestEntity, Integer> {

	

}
