package net.javagiudes.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javagiudes.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
