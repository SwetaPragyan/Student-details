package com.example.spring.Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.Student.Entity.StudentEntity;
import com.example.spring.Student.Repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository studentRepo;

public List<StudentEntity> getAll()
{
  return studentRepo.findAll();
}
public  StudentEntity getById(int id)
{
	return studentRepo.findById(id).orElse(null);
}
public List<StudentEntity> saveStudents(List<StudentEntity> student)
{
	return studentRepo.saveAll(student);
}
public StudentEntity save(StudentEntity student)
{
	return studentRepo.save(student);
}	

public String deleteById(int id)
{
	studentRepo.deleteById(id);
	return "record deleted";
}
public String deleteAll()
{
	studentRepo.deleteAll();
	return "record deleted";
}


}



