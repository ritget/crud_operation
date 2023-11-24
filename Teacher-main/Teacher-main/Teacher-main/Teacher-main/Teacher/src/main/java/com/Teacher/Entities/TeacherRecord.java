package com.Teacher.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeacherRecord {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "TeachId")
    private int id;
    @Column(name="TeachName")
    private String name;
    @Column(name="TeachAge")
    private int age;


}
