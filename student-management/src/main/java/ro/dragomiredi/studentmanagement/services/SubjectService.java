package ro.dragomiredi.studentmanagement.services;

import ro.dragomiredi.studentmanagement.entities.Mark;
import ro.dragomiredi.studentmanagement.entities.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject getSubjectsById(Integer subjectId);

    Subject saveSubject(Subject subject);

    Subject updateSubjectById(Subject subject , Integer subjectId);

    void deleteSubjectById(Integer subjectId);
}
