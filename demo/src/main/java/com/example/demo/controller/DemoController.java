package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/name")
	public ResponseEntity<DemoModel> print() {
		DemoModel dm = new DemoModel("John","25");
		return ResponseEntity.ok(dm);
	}
}


class DemoModel {
	
	public DemoModel(String name,String age) {
		this.name=name;
		this.age=age;
	}
	private String name;
	private String age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
}
