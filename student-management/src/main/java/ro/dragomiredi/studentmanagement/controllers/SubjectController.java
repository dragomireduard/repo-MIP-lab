package ro.dragomiredi.studentmanagement.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.dragomiredi.studentmanagement.entities.Subject;
import ro.dragomiredi.studentmanagement.services.SubjectService;

import java.util.List;

@RestController
@RequestMapping("/subjects")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {return subjectService.getAllSubjects();}

    @GetMapping("/{subjectId}")
    public Subject getSubjectById(@PathVariable Integer subjectId) { return subjectService.getSubjectsById(subjectId);}

    @PostMapping
    public Subject saveSubject(@RequestBody Subject subject){ return subjectService.saveSubject(subject);}

    @PutMapping("/{subjectId}")
    public Subject updateSubjectById(@RequestBody Subject subject, @PathVariable Integer subjectId){
        return subjectService.updateSubjectById(subject, subjectId);
    }

    @DeleteMapping("/{subjectId}")
    public void deleteSubjectById(@PathVariable Integer subjectId) { subjectService.deleteSubjectById(subjectId);}
}
