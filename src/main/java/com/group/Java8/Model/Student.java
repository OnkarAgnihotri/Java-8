package com.group.Java8.Model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {

    private Integer rollNumber;
    private String name;
    private Character gender;
    private Integer age;

    public static List<Student> getStudentList() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student(1, "Student1", 'M', 7);
        Student s2 = new Student(2, "Student2", 'F', 8);
        Student s3 = new Student(2, "Student2", 'F', 25);
        Student s4 = new Student(2, "Student2", 'F', 21);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        return studentList;
    }
}
