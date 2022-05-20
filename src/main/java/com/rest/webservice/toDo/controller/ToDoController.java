package com.rest.webservice.toDo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.webservice.toDo.Model.ToDo;
import com.rest.webservice.toDo.service.ToDoService;

@RestController
@CrossOrigin("http://localhost:4200")
public class ToDoController {
	
	@Autowired
	private ToDoService todoService;
	
	@GetMapping(path="get/todoList/{username}")
	public List<ToDo> getToDoList(@PathVariable String username) {
		return todoService.getToDoList(username);
	}
	
	@DeleteMapping(path="delete/todo/{username}/{id}")
	public ResponseEntity deleteTodo(@PathVariable String username, @PathVariable int id) {
		ToDo todo = todoService.deleteById(username, id);
		if(todo != null) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping(path="update/todo/{username}/{id}")
	public ResponseEntity updateToDo(@PathVariable String username, @PathVariable int id, @RequestBody ToDo todo) {
		ToDo resultTodo = todoService.updateById(username, id, todo);
		if(resultTodo != null) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping(path="add/todo/{username}")
	public ToDo addToDo(@PathVariable String username, @RequestBody ToDo todo) {
		ToDo resultTodo = todoService.updateById(username, 0, todo);
		return resultTodo;
	}
	
	@GetMapping(path="get/todo/{username}/{id}")
	public ToDo getTodoById(@PathVariable String username, @PathVariable int id) {
		ToDo todo = todoService.findById(id);
		return todo;
	}

}
