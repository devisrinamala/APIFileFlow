package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.user;
import com.example.demo.services.userservice;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:4200")
public class usercontroller {

	@Autowired
	userservice ss;
	
	@PostMapping("/insert")
	public user insert_stu(@RequestBody user st) {
		return ss.insert_stu(st);
	}
	
	@PostMapping("/addall")
	public Iterable<user> addall(@RequestBody List<user> st) {
		return ss.addall(st);
	}
	
	@GetMapping("/fetchall")
	public List<user> fetchall() {
		return ss.fetchall();
	}
	
	@GetMapping("/fetchbyid/{id}")
	public Optional<user> fetchbyid(@PathVariable int id) {
		return ss.fetchbyid(id);
	}
	@DeleteMapping("/delbyid/{id}")
	public String delbyid(@PathVariable int id) {
		return ss.delbyid(id);
	}
	
	@PutMapping("/update")
	public user updating(@RequestBody user u) {
		return ss.upd(u);
	}
	
	
	
}
