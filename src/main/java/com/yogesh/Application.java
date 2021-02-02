package com.yogesh;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yogesh.entity.Student;
import com.yogesh.repo.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepo studentRepository = context.getBean(StudentRepo.class);

		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("Ram");
		s.setStudentEmail("ram@ashokit.in");
		s.setStudentAge(24);
		
		studentRepository.save(s);
		
	
		/*
		 * Optional<Student> findById = studentRepository.findById(101);
		 * if(findById.isPresent()) { System.out.println(findById.get()); }
		 */
		
		context.close();
		
	}
	
	

}

