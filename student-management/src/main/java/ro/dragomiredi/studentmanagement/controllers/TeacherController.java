package ro.dragomiredi.studentmanagement.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.dragomiredi.studentmanagement.entities.Teacher;
import ro.dragomiredi.studentmanagement.services.TeacherService;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAllTeachers() { return teacherService.getAllTeachers(); }

    @GetMapping("/{teacherId}")
    public Teacher getTeacherById(@PathVariable Integer teacherId) { return teacherService.getTeachersById(teacherId);}

    @PostMapping
    public Teacher saveTeacher(@RequestBody Teacher teacher){return teacherService.saveTeacher(teacher);}

    @PutMapping("/{teacherId}")
    public Teacher updateTeacherById(@RequestBody Teacher teacher, @PathVariable Integer teacherId){
        return teacherService.updateTeacherById(teacher, teacherId);
    }

    @DeleteMapping("/{teacherId}")
    public void deleteTeacherById(@PathVariable Integer teacherId){ teacherService.deleteTeacherById(teacherId);}
}
