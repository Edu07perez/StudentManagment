package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepositoty studentRepositoty;
	@Override
	public void run(String... args) throws Exception {
		//Sirve solo para crear los primeros elementos en la base de datos.
		/*
		Student student1 = new Student("Ramesh","Fadatare","ramesh@gmail.com");
		studentRepositoty.save(student1);

		Student student2 = new Student("Sanjay","Jadvah","sanjay@gmail.com");
		studentRepositoty.save(student2);

		Student student3 = new Student("Marco","Aguilar","marco@gmail.com");
		studentRepositoty.save(student3);

		 */
	}
}
