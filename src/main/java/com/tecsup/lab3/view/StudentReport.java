package com.tecsup.lab3.view;

import com.tecsup.lab3.model.Student;
import java.util.List;

public class StudentReport {
    public static void print(List<Student> students) {
        System.out.println("=== Student Report ===");
        for (Student s : students) {
            System.out.println(s.getName() + " (" + s.getAge() + ")");
        }
    }
}
