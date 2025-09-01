package com.tecsup.lab3.controller;

import com.tecsup.lab3.model.Student;
import java.util.*;

public class StudentController {
    private Map<Long, Student> students = new HashMap<>();

    public void addStudent(Student s) {
        students.put(s.getId(), s);
    }

    public Student findById(Long id) {
        return students.get(id);
    }

    public void removeStudent(Long id) {
        students.remove(id);
    }

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }
}

