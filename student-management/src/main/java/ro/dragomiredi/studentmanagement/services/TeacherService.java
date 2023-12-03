package ro.dragomiredi.studentmanagement.services;


import ro.dragomiredi.studentmanagement.entities.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeachersById(Integer teacherId);

    Teacher saveTeacher(Teacher teacher);

    Teacher updateTeacherById(Teacher teacher , Integer teacherId);

    void deleteTeacherById(Integer teacherId);
}
