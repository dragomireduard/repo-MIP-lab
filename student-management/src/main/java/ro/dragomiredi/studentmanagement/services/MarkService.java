package ro.dragomiredi.studentmanagement.services;

import ro.dragomiredi.studentmanagement.entities.Mark;

import java.util.List;

public interface MarkService {

    List<Mark> getAllMarks();
    Mark getMarksById(Integer markId);

    Mark saveMark(Mark mark);

    Mark updateMarkById(Mark mark , Integer markId);

    void deleteMarkById(Integer markId);
}
