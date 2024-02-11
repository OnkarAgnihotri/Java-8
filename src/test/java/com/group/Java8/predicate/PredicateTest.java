package com.group.Java8.predicate;

import com.group.Java8.Model.Student;
import org.junit.gen5.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;


class PredicateTest {

    @Test
    public void isBeetweenTest(){
        Predicate predicate = new Predicate();

        Assertions.assertTrue(predicate.isBeetween(15), "15 is beeween 10 and 20");
        Assertions.assertFalse(predicate.isBeetween(10), "10 is beeween 10 and 20");
        Assertions.assertFalse(predicate.isBeetween(20), "20 is beeween 10 and 20");

        Assertions.assertFalse(predicate.isBeetween(9), "9 is beeween 10 and 20");
        Assertions.assertFalse(predicate.isBeetween(21), "21 is beeween 10 and 20");

        predicate.isAgeGt21andGenderFemale(predicate.getStudentList());

    }

    @Test
    public void isAgeGt21andGenderFemale(){
        Predicate predicate = new Predicate();
        List<Student> list = predicate.getStudentList();
        Student student = (Student) predicate.isAgeGt21andGenderFemale(list).get(0);
        Assertions.assertEquals(2, student.getRollNumber());
    }

}