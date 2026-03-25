package com.sample.rest_example.service;

import com.sample.rest_example.model.Student;
import com.sample.rest_example.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student student) {
        Student existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(student.getName());
            existing.setCourse(student.getCourse());
        }
        return repository.save(existing);
    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
}
