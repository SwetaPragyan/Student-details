package com.example.spring.Student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.Student.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
