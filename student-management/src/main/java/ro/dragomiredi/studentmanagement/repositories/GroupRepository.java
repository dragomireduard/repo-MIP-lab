package ro.dragomiredi.studentmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.dragomiredi.studentmanagement.entities.Group;

@Repository
public interface GroupRepository extends JpaRepository<Group , Integer> {
}
