package ro.dragomiredi.studentmanagement.services;

import ro.dragomiredi.studentmanagement.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentsById(Integer studentId);

    Student saveStudent(Student student);

    Student updateStudentById(Student student , Integer studentId);

    void deleteStudentById(Integer studentId);
}
