package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList list;
    Student s1;
    Student s2;

    @BeforeEach
    void init() {
        list = new StudentList();
        list.addNewStudent("66xxxxxx", "kong", 25);
        list.addNewStudent("67xxxxxx", "saac", 50);
        s1 = new Student("66xxxxxx", "kong", 25);
        s2 = new Student("67xxxxxx", "saac", 50);
    }

    @Test
    void testAddNewStudent() {
        list = new StudentList();
        list.addNewStudent("66xxxxxx", "kong");
        assertEquals("66xxxxxx", list.getStudents().get(0).getId());
        assertEquals("kong", list.getStudents().get(0).getName());
        list.addNewStudent("67xxxxxx", "saac", 20);
        assertEquals("67xxxxxx", list.getStudents().get(1).getId());
        assertEquals("saac", list.getStudents().get(1).getName());
        assertEquals(20, list.getStudents().get(1).getScore());
    }

    @Test
    void testFindStudentById() {
        assertEquals(s1.getName(), list.findStudentById("66xxxxxx").getName());
    }

    @Test
    void testGiveScoreToId() {
        list.giveScoreToId("66xxxxxx", 20);
        assertEquals(20, list.findStudentById("66xxxxxx").getScore());
    }

    @Test
    void testViewGradeOfId() {
        assertEquals(s1.grade(), list.viewGradeOfId("66xxxxxx"));
    }

}