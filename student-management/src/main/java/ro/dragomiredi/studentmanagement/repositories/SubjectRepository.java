package ro.dragomiredi.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.dragomiredi.studentmanagement.entities.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject , Integer> {
}
