package ro.dragomiredi.studentmanagement.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.dragomiredi.studentmanagement.entities.Student;
import ro.dragomiredi.studentmanagement.services.GroupService;
import ro.dragomiredi.studentmanagement.services.StudentService;


@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final GroupService groupService;
    private final StudentService studentService;

    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/edit/{id}")
    public String editStudentForm(@PathVariable Integer id, Model model) {
        model.addAttribute("student", studentService.getStudentsById(id));
        model.addAttribute("groups", groupService.getAllGroups());
        model.addAttribute("type", "update");
        return "create_student";
    }

    @PostMapping("/{id}")
    public String updateStudent(@PathVariable Integer id,
                                @ModelAttribute("student") Student student) {

        studentService.updateStudentById(student, id);
        return "redirect:/students";
    }
    @GetMapping("/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        model.addAttribute("groups", groupService.getAllGroups());

        model.addAttribute("type", "create");
        return "create_student";
    }

    @PostMapping
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/{studentId}")
    public String deleteStudentById(@PathVariable Integer studentId){
        studentService.deleteStudentById(studentId);
        return "redirect:/students";
    }

}
