package com.example.spring.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.Student.Entity.StudentEntity;
import com.example.spring.Student.Service.StudentService;

@RestController
public class StudentController {
@Autowired
private StudentService studentservice;
@GetMapping("/students")
public List<StudentEntity> getAll()
{
	return studentservice.getAll();
}
@GetMapping("/student/{id}")
public StudentEntity getById(@PathVariable int id)
{
	return studentservice.getById(id);
}
@PostMapping("/addstudents")
public StudentEntity addstudents(@RequestBody StudentEntity student)
{
	return studentservice.save(student);
}
@PostMapping("/addProducts")
public List<StudentEntity> addStudents(List<StudentEntity> student)
{
	return studentservice.saveStudents(student);
}
@DeleteMapping("/removeStudent/{id}")
public String removeStudent(@PathVariable int id)
{
	studentservice.deleteById(id);
	return "student deleted";
}
@DeleteMapping("/removeAllStudents")
public String removeAllStudents()
{
	return studentservice.deleteAll();
}















}
