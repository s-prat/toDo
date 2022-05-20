package com.rest.webservice.toDo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.webservice.toDo.Model.ToDo;

@Service
public class ToDoService {
	
	private static List<ToDo> todos = new ArrayList<>();
	private static int idCounter = 0;
	
	static {
		
		todos.add(new ToDo(++idCounter, "abc", new Date(), false));
		todos.add(new ToDo(++idCounter, "def", new Date(), false));
		todos.add(new ToDo(++idCounter, "mno", new Date(), false));
		todos.add(new ToDo(++idCounter, "xyz", new Date(), false));
				
	}
	
	public ToDo findById(int id) {
		for(ToDo todo: todos) {
			if(id == todo.getId()) {
				return todo;
			}
		}
		return null;
	}
	
	public List<ToDo> getToDoList(String username) {
		return todos;
	}
	
	public ToDo deleteById(String username, int id) {
		ToDo todo = findById(id);
		if(todo != null) {
			todos.remove(todo);
			return todo;
		}
		return null;
	}
	
	public ToDo updateById(String username, int id, ToDo todo) {
		if(id<1) {
			ToDo finalToDo = new ToDo(++idCounter, todo.getDescription(), todo.getTargetDate(), false);
			todos.add(finalToDo);
			return finalToDo;
		} else {
			ToDo retreivedTodo = findById(id);
			if(retreivedTodo != null) {
				todos.remove(retreivedTodo);
				todos.add(todo);
				return todo;
			} else {
				return null;
			}
		}
	}

}
