package com.JanMotene.Student.Manager;

import com.JanMotene.Student.Manager.Model.Student;
import com.JanMotene.Student.Manager.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagerApplication implements CommandLineRunner {


	public static void main(String[] args) {

		SpringApplication.run(StudentManagerApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
		Student student = new Student();
		student.setFirstName("Jan");
		student.setLastName("Motene");
		student.setEmailId("motenejo@gmail.com");
		studentRepository.save(student);

		Student student1 = new Student();
		student1.setFirstName("Elon");
		student1.setLastName("Musk");
		student1.setEmailId("Elon@gmail.com");
		studentRepository.save(student1);
	}
}
