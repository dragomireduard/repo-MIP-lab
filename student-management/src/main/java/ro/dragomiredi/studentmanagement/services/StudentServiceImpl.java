package ro.dragomiredi.studentmanagement.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ro.dragomiredi.studentmanagement.entities.Student;
import ro.dragomiredi.studentmanagement.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents(){ return studentRepository.findAll(); }
    @Override
    public Student getStudentsById(Integer studentId){
        Optional<Student> studentOptional = studentRepository.findById(studentId);
        if(studentOptional.isPresent()){
            return studentOptional.get();
        }
        throw new RuntimeException("Student with id " + studentId + " not found");
    }

    @Override
    public Student saveStudent(Student student){ return studentRepository.save(student);}

    @Override
    public Student updateStudentById(Student student , Integer studentId){
        Student studentToUpdate = getStudentsById(studentId);
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setLastName(student.getLastName());
        studentToUpdate.setGroup(student.getGroup());
        studentToUpdate.setEmail(student.getEmail());
        studentToUpdate.setCnp(student.getCnp());
        return studentRepository.save(studentToUpdate);
    }

    @Override
    public void deleteStudentById(Integer studentId){
        Student studentToDelete = getStudentsById(studentId);
        studentRepository.delete(studentToDelete);
    }


}
