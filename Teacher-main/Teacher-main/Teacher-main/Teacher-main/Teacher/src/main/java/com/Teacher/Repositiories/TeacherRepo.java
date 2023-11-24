package com.Teacher.Repositiories;

import com.Teacher.Entities.TeacherRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<TeacherRecord,Integer> {
}
