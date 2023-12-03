package ro.dragomiredi.studentmanagement.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.dragomiredi.studentmanagement.entities.Subject;
import ro.dragomiredi.studentmanagement.entities.Teacher;
import ro.dragomiredi.studentmanagement.repositories.TeacherRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    @Override
    public List<Teacher> getAllTeachers(){ return teacherRepository.findAll();}
    @Override
    public Teacher getTeachersById(Integer teacherId){
        Optional<Teacher> teacherOptional = teacherRepository.findById(teacherId);
        if(teacherOptional.isPresent()){
            return teacherOptional.get();
        }
        throw new RuntimeException("Teacher with id " + teacherId + " not found");
    }
    @Override
    public Teacher saveTeacher(Teacher teacher){return teacherRepository.save(teacher);}
    @Override
    public Teacher updateTeacherById(Teacher teacher , Integer teacherId){
        Teacher teacherToUpdate = getTeachersById(teacherId);
        teacherToUpdate.setFirstName(teacher.getFirstName());
        teacherToUpdate.setLastName(teacher.getLastName());
        teacherToUpdate.setTelephoneNumber(teacher.getTelephoneNumber());
        teacherToUpdate.setEmail(teacher.getEmail());
        teacherToUpdate.setEmploymentYear(teacher.getEmploymentYear());
        teacherToUpdate.setSubjects(teacher.getSubjects());
        return teacherRepository.save(teacherToUpdate);
    }
    @Override
    public void deleteTeacherById(Integer teacherId){
        Teacher teacherToDelete = getTeachersById(teacherId);
        teacherRepository.delete(teacherToDelete);
    }
}
