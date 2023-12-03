package ro.dragomiredi.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.dragomiredi.studentmanagement.entities.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
