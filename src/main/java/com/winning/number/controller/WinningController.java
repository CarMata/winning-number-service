package com.winning.number.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/winning")
public class WinningController {

	@GetMapping
	public ResponseEntity<Object> execute(){
		Map<String,String> response = new HashMap<>();
		response.put("key", "value");
		return ResponseEntity.ok().body(response); 
	}
}
