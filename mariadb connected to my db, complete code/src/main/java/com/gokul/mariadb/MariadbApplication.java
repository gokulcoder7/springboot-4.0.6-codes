package com.gokul.mariadb;

import com.gokul.mariadb.dao.StudentDAO;
import com.gokul.mariadb.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MariadbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MariadbApplication.class, args);

	}





	@Bean
	CommandLineRunner cmdl(StudentDAO sd){

		return runner-> {
			createstudent(sd);

		};

	}

	private void createstudent(StudentDAO sd) {

       Student temps=new Student("gokul","dio2","gokul655@gmail.com");
	   sd.save(temps);

	   System.out.println("id of student=="+ temps.getId());
	}

}
