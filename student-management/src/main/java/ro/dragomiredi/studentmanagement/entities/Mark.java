package ro.dragomiredi.studentmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mark")
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int markId;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacherId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Teacher studentId;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    private Date examDate;

    private int grade;


}
