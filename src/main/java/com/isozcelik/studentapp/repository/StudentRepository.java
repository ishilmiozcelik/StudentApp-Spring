package com.isozcelik.studentapp.repository;

import com.isozcelik.studentapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer>{




}
