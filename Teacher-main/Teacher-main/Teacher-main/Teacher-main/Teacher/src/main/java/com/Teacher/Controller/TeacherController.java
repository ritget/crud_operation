package com.Teacher.Controller;

import com.Teacher.Entities.TeacherRecord;
import com.Teacher.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@CrossOrigin("*")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/create")
    public TeacherRecord createTeacher(@RequestBody TeacherRecord teacherRecord){
        return this.teacherService.teacherData(teacherRecord);
    }
    @GetMapping("/get/{id}")
    public TeacherRecord getTeachById(@PathVariable Integer id){
        return this.teacherService.teacherById(id);
    }
    @PutMapping("/update/{id}")
    public TeacherRecord updateTeacher(@PathVariable Integer id,@RequestBody TeacherRecord teacherRecord){
        return this.teacherService.updateTeacher(id,teacherRecord);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable int id){
        return this.teacherService.deleteTeacher(id);
    }
}
