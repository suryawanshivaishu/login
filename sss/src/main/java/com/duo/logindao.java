package com.duo;

import java.util.List;

import com.controller.login;


public interface logindao {
	
	public void saveStudentobj(login student);
	public login getStudentobj(String username);
	public List<login> getAllStudents();


	
	

}
