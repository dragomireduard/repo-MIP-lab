//package ro.dragomiredi.studentmanagement.controllers;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import ro.dragomiredi.studentmanagement.entities.Group;
//import ro.dragomiredi.studentmanagement.entities.Student;
//import ro.dragomiredi.studentmanagement.services.GroupService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/groups")
//@RequiredArgsConstructor
//public class GroupController {
//    private final GroupService groupService;
//
//    @GetMapping
//    public List<Group> getAllGroups(){
//        return groupService.getAllGroups();
//    }
//
//    @GetMapping("/{groupId}")
//    public Group getGroupById(@PathVariable Integer groupId){
//        return groupService.getGroupById(groupId);
//    }
//
//    @PostMapping
//    public Group saveGroup(@RequestBody Group group){
//        return groupService.saveGroup(group);
//    }
//
//    @PutMapping("/{groupId}")
//    public Group updateGroupById(@RequestBody Group group , @PathVariable Integer groupId){ return groupService.updateGroupById( group, groupId ); }
//
//    @DeleteMapping("/{groupId}")
//    public void deleteGroupById(@PathVariable Integer groupId){
//        groupService.deleteGroupById(groupId);
//    }
//
//    @GetMapping
//    public String listGroups(Model model) {
//        model.addAttribute("groups", groupService.getAllGroups());
//        return "groups";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String editStudentForm(@PathVariable Integer id, Model model) {
//        model.addAttribute("group", groupService.getGroupById(id));
//        model.addAttribute("type", "update");
//        return "create_group";
//    }
//
//    @PostMapping("/{id}")
//    public String updateGroup(@PathVariable Integer id,
//                                @ModelAttribute("group") Group group) {
//
//        groupService.updateGroupById(group, id);
//        return "redirect:/groups";
//    }
////    @GetMapping("/new")
////    public String createStudentForm(Model model) {
////
////        // create student object to hold student form data
////        Student student = new Student();
////        model.addAttribute("student", student);
////        model.addAttribute("type", "create");
////        return "create_student";
////    }
////
////    @PostMapping
////    public String saveStudent(@ModelAttribute("student") Student student) {
////        studentService.saveStudent(student);
////        return "redirect:/students";
////    }
////
////    @GetMapping("/{studentId}")
////    public String deleteStudentById(@PathVariable Integer studentId){
////        studentService.deleteStudentById(studentId);
////        return "redirect:/students";
////    }
//}


