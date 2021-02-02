package com.yogesh.repo;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.yogesh.entity.Student;

public interface StudentRepo extends CrudRepository<Student,Serializable>{

}
