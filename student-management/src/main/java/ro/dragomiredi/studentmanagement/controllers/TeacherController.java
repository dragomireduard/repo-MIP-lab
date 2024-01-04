package ro.dragomiredi.studentmanagement.controllers;//package ro.dragomiredi.studentmanagement.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ro.dragomiredi.studentmanagement.entities.Teacher;
import ro.dragomiredi.studentmanagement.services.SubjectService;
import ro.dragomiredi.studentmanagement.services.TeacherService;

@Controller
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {
    private final TeacherService teacherService;
    private final SubjectService subjectService;

    @GetMapping
    public String listTeachers(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teachers";
    }

    @GetMapping("/edit/{id}")
    public String editTeacherForm(@PathVariable Integer id, Model model) {
        model.addAttribute("teacher", teacherService.getTeachersById(id));
        model.addAttribute("subjects", subjectService.getAllSubjects());
        model.addAttribute("type", "update");
        return "create_update_teacher";
    }

    @PostMapping("/{id}")
    public String updateTeacher(@PathVariable Integer id,
                                @ModelAttribute("teacher") Teacher teacher) {
        teacherService.updateTeacherById(teacher, id);
        return "redirect:/teachers";
    }

    @GetMapping("/new")
    public String createTeacherForm(Model model) {
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        model.addAttribute("subjects", subjectService.getAllSubjects());
        model.addAttribute("type", "create");
        return "create_update_teacher";
    }

    @PostMapping
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/{teacherId}")
    public String deleteTeacherById(@PathVariable Integer teacherId) {
        teacherService.deleteTeacherById(teacherId);
        return "redirect:/teachers";
    }
}

