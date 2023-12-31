package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ResponseDto;
import com.example.demo.service.TodoService;

@RestController
@RequestMapping("todo")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/test")
	public ResponseEntity<?> testTodo(){
		String str = todoService.testService();
		List<String> list = new ArrayList<>();
		list.add(str);
		
		ResponseDto<String> response = ResponseDto.<String>builder().data(list).build();
		return ResponseEntity.ok().body(response);
		
	}

}
