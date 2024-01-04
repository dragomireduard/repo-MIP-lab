package ro.dragomiredi.studentmanagement.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ro.dragomiredi.studentmanagement.entities.Subject;
import ro.dragomiredi.studentmanagement.repositories.SubjectRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService{
    private final SubjectRepository subjectRepository;
    @Override
    public List<Subject> getAllSubjects(){ return subjectRepository.findAll(); }
    @Override
    public Subject getSubjectsById(Integer subjectId){
        Optional<Subject> subjectOptional = subjectRepository.findById(subjectId);
        if(subjectOptional.isPresent()){
            return subjectOptional.get();
        }
        throw new RuntimeException("Subject with id " + subjectId + " not found");
    }

    @Override
    public Subject saveSubject(Subject subject) { return subjectRepository.save(subject); }
    @Override
    public Subject updateSubjectById(Subject subject , Integer subjectId){
        Subject subjectToUpdate = getSubjectsById(subjectId);
        subjectToUpdate.setName(subject.getName());
        subjectToUpdate.setShortName(subject.getShortName());
        subjectToUpdate.setCredits(subject.getCredits());

        return subjectRepository.save(subjectToUpdate);

    }
    @Override
    public void deleteSubjectById(Integer subjectId){
        Subject subjectToDelete = getSubjectsById(subjectId);
        subjectRepository.delete(subjectToDelete);
    }
}
