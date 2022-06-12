package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin 
@RestController

public class control {
	@Autowired
	private PalawenicollectionRepository st  ;
	@PostMapping("/create")
	public void createstudent( @RequestBody Palawenicollection student ) {
		st.insert(student) ;
	}
	@PostMapping("/del{id}")
	public void delstudent( @PathVariable String id ) {
		st.deleteById(id);
		}
	@GetMapping("/list")
	public List<Palawenicollection> liststudent() {
		
		return st.findAll();
	}
	
	
	@GetMapping("/test")
	public String nt() {
		
		return "giiggig " ;
	}

	@RequestMapping(value = "/ex", method = RequestMethod.GET)
	@ResponseBody
	public String ntt() {
		
		return "giig " ;
	}

	
}
