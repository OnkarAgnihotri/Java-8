package com.group.Java8;

import com.group.Java8.model.Student;
import com.group.Java8.lambdaExpressions.Predicate;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8Application {
    public static void main(String[] args) {
        Student student = new Student();
        Predicate predicate = new Predicate();
        predicate.isAgeGt21andGenderFemale(student.getStudentList());
        predicate.isBeetween(20);
    }
}
