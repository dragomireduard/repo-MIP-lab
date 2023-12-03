package ro.dragomiredi.studentmanagement.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.dragomiredi.studentmanagement.entities.Student;
import ro.dragomiredi.studentmanagement.services.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() { return studentService.getAllStudents(); }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId) { return studentService.getStudentsById(studentId);}

    @PostMapping
    public Student saveStudent(@RequestBody Student student) { return studentService.saveStudent(student); }

    @PutMapping("/{studentId}")
    public Student updateStudentsById(@RequestBody Student student, @PathVariable Integer studentId){
        return studentService.updateStudentById( student, studentId );
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudentById(@PathVariable Integer studentId){ studentService.deleteStudentById(studentId); }
}
