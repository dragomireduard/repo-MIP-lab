package ro.dragomiredi.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.dragomiredi.studentmanagement.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
