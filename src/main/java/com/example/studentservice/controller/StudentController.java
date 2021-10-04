package com.example.studentservice.controller;

import com.example.studentservice.VO.ResponseTemplateVO;
import com.example.studentservice.enity.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/")
    //
    public Student saveStudent(@RequestBody Student student){
//
        return studentService.saveStudent(student);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getStudentWithKhoa(@PathVariable("id")
                                                            Long studentId){
        return studentService.getStudentWithKhoa(studentId);
    }
}
