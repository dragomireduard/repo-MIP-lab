package ro.dragomiredi.studentmanagement.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.dragomiredi.studentmanagement.entities.Mark;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Integer> {
}
