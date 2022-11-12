package todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import to.model.Todo;
import to.repositories.ToDoRepository;

@RestController
@RequestMapping ("/todo")
public class toDoController {
	
	
	
	@Autowired
	ToDoRepository toDoRepository;
	
	
	@GetMapping ("/findAll")
	public List<Todo> fetchAll()
	{
		return  this.toDoRepository.findAll() ;
		
	}

}
