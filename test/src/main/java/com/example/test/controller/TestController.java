package com.example.test.controller;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.entity.TestEntity;
import com.example.test.repo.TestRepo;

@RestController
public class TestController {
	@Autowired
	TestRepo testRepo;

	@PostMapping("/savetest")
	public TestEntity savetest(@RequestBody TestEntity test) {
		return testRepo.save(test);

	}

	@GetMapping("/gettest")
	public List<TestEntity> findAlltest(){
		return testRepo.findAll();
	}
	@GetMapping("getById/{id}")
	public Optional<TestEntity> getById(@PathVariable Integer id){
		return testRepo.findById(id);
		
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById(@PathVariable Integer id){
		testRepo.deleteById(id);
		return "sucessfully deleted";
		
		
	}
	@PutMapping("/updatetest")
	public TestEntity updatetest(@RequestBody TestEntity test) {
		return testRepo.save(test);
		
	}
	@PutMapping("/updatetest/{id}")
	public TestEntity swamyById(@RequestBody TestEntity test, @PathVariable Integer id) {
		TestEntity test1=testRepo.findById(id).get();
		test1.setName(test.getName());
		testRepo.save(test1);
		return test1;
		
}
}
