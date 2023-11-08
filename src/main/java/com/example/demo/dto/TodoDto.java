package com.example.demo.dto;

import com.example.demo.model.TodoEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TodoDto {
	
	private String id;
	private String title;
	private boolean done;
	
	
	public TodoDto(final TodoEntity todoEntity) {
		this.id = todoEntity.getId();
		this.title = todoEntity.getTitle();
		this.done = todoEntity.isDone();
	}
	
	
}
