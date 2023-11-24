package com.Teacher.Service;

import com.Teacher.Entities.TeacherRecord;
import com.Teacher.Repositiories.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
 @Autowired
 private TeacherRepo teacherRepo;

 public TeacherRecord teacherData(TeacherRecord teacherRecord){
     TeacherRecord saveData= new TeacherRecord();
     saveData.setName(teacherRecord.getName());
     saveData.setAge(teacherRecord.getAge());
     return teacherRepo.save(saveData);
 }
 public TeacherRecord teacherById(int id){
     return this.teacherRepo.findById(id).get();
 }
 public TeacherRecord updateTeacher(int id, TeacherRecord dataUpdate){
     TeacherRecord oldData = this.teacherRepo.findById(id).get();
     TeacherRecord newData= new TeacherRecord();
     if(oldData.getName()!=null){
         newData.setId(id);
         newData.setName(dataUpdate.getName());
         newData.setAge(dataUpdate.getAge());
         this.teacherRepo.save(newData);
     }
     else{
         System.out.println("Teacher With Id:" + id + "Not Found");
     }
     return newData;
 }
 public String deleteTeacher(int id){
     this.teacherRepo.deleteById(id);
     return "User deleted with id :" + id + " Successfully";
 }
}
