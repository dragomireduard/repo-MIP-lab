package ro.dragomiredi.studentmanagement.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ro.dragomiredi.studentmanagement.entities.Group;
import ro.dragomiredi.studentmanagement.repositories.GroupRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;
    @Override
    public List<Group> getAllGroups(){
        return groupRepository.findAll();
    }
    @Override
    public Group getGroupById(Integer groupId){
        Optional<Group> groupOptional = groupRepository.findById(groupId);
        if(groupOptional.isPresent()){
            return groupOptional.get();
        }
        throw new RuntimeException("Group with id " + groupId + " not found");
    }
    @Override
    public Group saveGroup(Group group){
        return groupRepository.save(group);
    }
    @Override
    public Group updateGroupById(Group group , Integer groupId){
        Group groupToUpdate = getGroupById((groupId));
        groupToUpdate.setName(group.getName());
        return groupRepository.save(groupToUpdate);
    }
    @Override
    public void deleteGroupById(Integer groupId){
        Group groupToDelete = getGroupById(groupId);
        groupRepository.delete(groupToDelete);
    }

}
