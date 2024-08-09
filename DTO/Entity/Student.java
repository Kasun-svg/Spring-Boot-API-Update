package com.Kasun.Enterprices.First.Project.DTO.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
   private String name;
    private String nic;
  private int age;


    public Student(String fullName, int age, String nic) {
    this.name=fullName;
    this.nic=nic;
    this.age=age;
    }
}
