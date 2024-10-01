package com.demo.demoSpringboot;

import com.demo.demoSpringboot.entities.Student;
import com.demo.demoSpringboot.entities.User;
import com.demo.demoSpringboot.service.StudentService;
import com.demo.demoSpringboot.service.UserService;
import com.demo.demoSpringboot.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(DemoSpringbootApplication.class, args);




		Student student = new Student() ;

		student.setId(2);
		student.setFirstName("Dev");
		student.setLastName("Patel");
		student.setEmail("devp@gmail.com");
		student.setPhoneNumber("984737322");



		StudentService service = (StudentService) context.getBean(StudentService.class);
		Student s1 =  service.saveStudent(student);





		System.out.println(s1.toString());




	}




}
