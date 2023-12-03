package ro.dragomiredi.studentmanagement.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.dragomiredi.studentmanagement.entities.Mark;
import ro.dragomiredi.studentmanagement.services.MarkService;

import java.util.List;

@RestController
@RequestMapping("/marks")
@RequiredArgsConstructor
public class MarkController {
    private final MarkService markService;

    @GetMapping
    public List<Mark> getAllMarks() { return markService.getAllMarks(); }

    @GetMapping("/{markId}")
    public Mark getMarkById(@PathVariable Integer markId) { return markService.getMarksById(markId);}

    @PostMapping
    public Mark saveMark(@RequestBody Mark mark) { return markService.saveMark(mark); }

    @PutMapping("/{markId}")
    public Mark updateMarkById(@RequestBody Mark mark , @PathVariable Integer markId){
        return markService.updateMarkById(mark, markId);
    }

    @DeleteMapping("/{markId}")
    public void deleteMarkById(@PathVariable Integer markId){markService.deleteMarkById(markId);}
}
