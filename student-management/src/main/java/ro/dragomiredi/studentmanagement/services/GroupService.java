package ro.dragomiredi.studentmanagement.services;

import ro.dragomiredi.studentmanagement.entities.Group;

import java.util.List;

public interface GroupService {

    List<Group> getAllGroups();
    Group getGroupById(Integer groupId);

    Group saveGroup(Group group);

    Group updateGroupById(Group group , Integer groupId);

    void deleteGroupById(Integer groupId);


}
