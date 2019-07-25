package com.stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentClassTest {
    StudentClass studentClass;

    @Before
    public void setUp() throws Exception {


    }

    @After
    public void tearDown() throws Exception {
        studentClass = null;

    }

    @Test
    public void givenStringShouldReturnStudentClass() {

        List<StudentClass> students = new ArrayList<>();
        StudentClass obj1 = new StudentClass(1, "Gokul", 27);
        StudentClass obj2 = new StudentClass(2, "Katthi", 23);
        StudentClass obj3 = new StudentClass(3, "Mokshit", 37);
        StudentClass obj4 = new StudentClass(4, "Raghav", 22);
        StudentClass obj5 = new StudentClass(5, "GS", 29);
        StudentClass obj6 = new StudentClass(6, "Ravi", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);


        Collections.sort(students, new StudentSorter());



        String expected = "[Student{id=3, name='Mokshit', age=37}, Student{id=5, name='GS', age=29}, Student{id=1, name='Gokul', age=27}, Student{id=2, name='Katthi', age=23}, Student{id=6, name='Ravi', age=22}, Student{id=4, name='Raghav', age=22}]";
        assertEquals(expected, students.toString());


    }
}