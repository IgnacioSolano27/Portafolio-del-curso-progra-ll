package test.Entities;

import org.junit.Test;

import Entities.Course;
import Entities.Teacher;
import jdk.jfr.Timestamp;

import static org.junit.Assert.assertEquals;

public class CourseTest {
  @Test
  public void testCourseConstructorId(){
    Course course = new Course(123);
    assertEquals(course.getId(), 123); 
  }
  @Test
  public void testCourseConstructorName(){
    Course course = new Course("Progra II");
    assertEquals(course.getName(), "Progra II");
  }
}
