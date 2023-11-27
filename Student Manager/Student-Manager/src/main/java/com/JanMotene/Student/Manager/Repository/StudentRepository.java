package com.JanMotene.Student.Manager.Repository;

import com.JanMotene.Student.Manager.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    //All CRUD  Database Methods


}
