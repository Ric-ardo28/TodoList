package br.com.ricardo.todolist.controller;

import br.com.ricardo.todolist.entity.Todo;
import br.com.ricardo.todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	@PostMapping
	List<Todo> create(@RequestBody @Valid Todo todo){
		return todoService.create(todo);

	}
	@GetMapping
	List<Todo> list(){
		return todoService.list();
	}
	@PutMapping
	List<Todo> update(@RequestBody Todo todo){
		return todoService.update(todo);

	}
	@DeleteMapping("/{id}")
	List<Todo> delete(@PathVariable("id") Long id){
		return todoService.delete(id);

	}


}
