package com.Kasun.Enterprices.First.Project.Repo;

import com.Kasun.Enterprices.First.Project.DTO.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>  {
}
