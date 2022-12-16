package com.example.Players;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class PlayersController {
	@Autowired
	PlayersService ps;
//	@PostMapping(value="/posting")
//	public String post(@RequestBody List<Players> p) {
//		return ps.post(p);
//	}
	@PostMapping(value="/post")
	public String post(@RequestBody List<Players> p) {
		return ps.post(p);
	}
	
	
	  @PutMapping(value="/putting") 
	  public String put(@RequestBody Players p) {
	  return ps.put(p); }
	  
	  @GetMapping(value="/getting") 
	  public List<Players> getting() { 
		  return ps.getting(); }
	  
	  @GetMapping(value="/getById/{id}") 
	  public Players getById(@PathVariable int id) { 
		  return ps.getById(id);
	  }
	  
	  @DeleteMapping(value="/deleting/{id}") 
	  public String deleteById(@PathVariable
	  int id) { 
		  return ps.deleteById(id); 
		  }
	  
	  @DeleteMapping(value="/remove") 
	  public String remove() { 
		  return ps.remove();
	  }
	  
	  
	  //Query
	  
	  @GetMapping(value="/gettingNames") 
	  public List<Players> getName(@RequestBody
	  List<Players> p) { 
		  return ps.getName(p); 
		  }
	  
	  @GetMapping(value="/getByName/{name}") 
	  public List<Players>
	  getByName(@PathVariable String name) { 
		  return ps.getByName(name);
		  }
	  
	 
}
