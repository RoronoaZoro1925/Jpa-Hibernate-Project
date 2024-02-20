package com.in28minutes.sprigboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.sprigboot.learnjpahibernate.course.Course;
import com.in28minutes.sprigboot.learnjpahibernate.course.SpringDataJpa.CourseSpringDataJpaRepository;
import com.in28minutes.sprigboot.learnjpahibernate.course.jpa.Course_JpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner 
{
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private Course_JpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception 
	{
		repository.save(new Course(1, "Learn AWS", "in28minutes"));
		repository.save(new Course(2, "Learn Azure", "Sarthak"));
		repository.save(new Course(3, "Learn GoogleCloud", "in28minutes"));
		repository.save(new Course(4, "Learn ChatGPT", "in28minutes"));
		
		repository.deleteById(4l);
		
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		
		System.out.println(repository.findByName("Learn Azure"));
		
	}
	

}
