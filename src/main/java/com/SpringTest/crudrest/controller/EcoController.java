package com.SpringTest.crudrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcoController {
	@GetMapping("/eco")
	public String eco(){
		return "eco!";
		}
}
