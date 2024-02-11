package com.group.Java8.predicate;

import com.group.Java8.Model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate<T> {

    public List<Student> getStudentList() {
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


    // filter using age > 21 gender F
    public List<Student> isAgeGt21andGenderFemale(List<Student> studentList) {
        return studentList.stream().filter(age -> (age.getAge() > 21)).filter(isMale -> isMale.getGender().equals('F')).collect(Collectors.toList());
    }

    public boolean isBeetween(Integer i1) {
        java.util.function.Predicate<Integer> isGreaterThan = i -> (i > 10);
        java.util.function.Predicate<Integer> isLowerThan = i -> (i < 20);
        return isGreaterThan.and(isLowerThan).test(i1);
    }


    //predicate
//    java.util.function.Predicate<Integer> isOdd = i -> (i % 2 != 0);
//    java.util.function.Predicate<String> isMatch = str -> (str.matches("\\d+"));
//        System.out.println(isOdd.test(4));
//        System.out.println(isMatch.test("1"));


}
