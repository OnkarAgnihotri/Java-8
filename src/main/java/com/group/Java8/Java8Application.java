package com.group.Java8;

import com.group.Java8.Model.Student;
import com.group.Java8.predicate.Predicate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8Application {
    public static void main(String[] args) {
        Student student = new Student();
        com.group.Java8.predicate.Predicate predicate = new Predicate();
        predicate.isAgeGt21andGenderFemale(student.getStudentList());
        predicate.isBeetween(20);
    }
}
