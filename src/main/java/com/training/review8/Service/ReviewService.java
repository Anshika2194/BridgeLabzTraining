package com.training.review8.Service;

import com.training.review8.Model.Student;
import com.training.review8.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudent(int id) {
        return repository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public Student updateStudent(int id, Student student) {

        Student existing = repository.findById(id).orElse(null);

        if (existing != null) {
            existing.setName(student.getName());
            existing.setCourse(student.getCourse());
            return repository.save(existing);
        }
        return null;
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student Deleted ";
    }

}