package ro.dragomiredi.studentmanagement.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.dragomiredi.studentmanagement.entities.Mark;
import ro.dragomiredi.studentmanagement.repositories.MarkRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MarkServiceImpl implements MarkService {
    private final MarkRepository markRepository;

    @Override
    public List<Mark> getAllMarks(){ return markRepository.findAll(); }
    @Override
    public Mark getMarksById(Integer markId){
        Optional<Mark> markOptional = markRepository.findById(markId);
        if(markOptional.isPresent()){
            return markOptional.get();
        }
        throw new RuntimeException("Mark with id " + markId + " not found");
    }

    @Override
    public Mark saveMark(Mark mark){ return  markRepository.save(mark);}

    @Override
    public Mark updateMarkById(Mark mark , Integer markId){
        Mark markToUpdate = getMarksById(markId);
        markToUpdate.setTeacherId(mark.getTeacherId());
        markToUpdate.setStudentId(mark.getStudentId());
        markToUpdate.setSubject(mark.getSubject());
        markToUpdate.setExamDate(mark.getExamDate());
        markToUpdate.setGrade(mark.getMarkId());
        return markRepository.save(markToUpdate);
    }

    @Override
    public void deleteMarkById(Integer markId){
        Mark markToDelete = getMarksById(markId);
        markRepository.delete(markToDelete);
    }
}
