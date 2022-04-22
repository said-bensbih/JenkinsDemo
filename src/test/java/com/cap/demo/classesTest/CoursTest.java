package com.cap.demo.classesTest;

import com.cap.demo.classes.Cours;
import com.cap.demo.classes.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ContextConfiguration(classes = {Cours.class})
@ExtendWith(SpringExtension.class)
public class CoursTest {
    @MockBean
    public Cours myCourse;
    @Test
    public void addStudent(){
        Student student = new Student();
        when(myCourse.addStudentToClass((Student) any())).thenReturn(1).thenReturn(0);
        student.setFirstName("Said");
        student.setLastName("Bensbih");
        student.setAge(14);
        student.getFirstName();
        int res = myCourse.addStudentToClass(student);
        verify(myCourse).addStudentToClass(student);
        assertEquals(1, res);
    }

}