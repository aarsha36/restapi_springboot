package com.sample.rest_example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sample.rest_example.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
