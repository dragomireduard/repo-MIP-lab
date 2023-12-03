package ro.dragomiredi.studentmanagement.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.dragomiredi.studentmanagement.entities.Group;
import ro.dragomiredi.studentmanagement.services.GroupService;

import java.util.List;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    @GetMapping
    public List<Group> getAllGroups(){
        return groupService.getAllGroups();
    }

    @GetMapping("/{groupId}")
    public Group getGroupById(@PathVariable Integer groupId){
        return groupService.getGroupById(groupId);
    }

    @PostMapping
    public Group saveGroup(@RequestBody Group group){
        return groupService.saveGroup(group);
    }

    @PutMapping("/{groupId}")
    public Group updateGroupById(@RequestBody Group group , @PathVariable Integer groupId){ return groupService.updateGroupById( group, groupId ); }

    @DeleteMapping("/{groupId}")
    public void deleteGroupById(@PathVariable Integer groupId){
        groupService.deleteGroupById(groupId);
    }
}
