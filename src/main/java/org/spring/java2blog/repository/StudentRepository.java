package org.spring.java2blog.repository;

import org.spring.java2blog.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}