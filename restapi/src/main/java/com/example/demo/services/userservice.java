package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.user;
import com.example.demo.repository.userrepository;

@Service

public class userservice {

	@Autowired
	userrepository sr;
	
	public user insert_stu(user st) {
		return sr.save(st);
	}
	
	public Iterable<user> addall(List<user> st) {
		return sr.saveAll(st);
	}
	
	public List<user> fetchall(){
		return (List<user>) sr.findAll();
	}
	
	public Optional<user> fetchbyid(int id) {
		return sr.findById(id);
	}
	
	public String delbyid(int id) {
		sr.deleteById(id);
		return "successfully deleted : "+id;
	}
	
	public user upd(user st) {
		int id = st.getId();
		user u = sr.findById(id).get();
		u.setName(st.getName());
		u.setBranch(st.getBranch());
		u.setEmail(st.getEmail());
		return sr.save(u);
	}
}
