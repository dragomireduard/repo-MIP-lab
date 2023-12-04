package ro.dragomiredi.studentmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String firstName;

    private String lastName;

    private String email;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;


    private Integer cnp;

}
