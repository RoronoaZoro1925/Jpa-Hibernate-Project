package com.in28minutes.sprigboot.learnjpahibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.sprigboot.learnjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class Course_JpaRepository 
{
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) 
	{
		entityManager.merge(course);
		
	}
	
	public Course findById(long Id) 
	{
		return entityManager.find(Course.class, Id);
	}
	
	public void deleteById(long Id) 
	{
		Course course = entityManager.find(Course.class, Id);
		entityManager.remove(course);
	}

}
