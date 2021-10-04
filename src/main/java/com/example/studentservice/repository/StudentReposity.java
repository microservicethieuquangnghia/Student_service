package com.example.studentservice.repository;

import com.example.studentservice.enity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReposity extends JpaRepository<Student,Long> {

}
