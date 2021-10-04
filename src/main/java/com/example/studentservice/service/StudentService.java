package com.example.studentservice.service;

import com.example.studentservice.VO.Khoa;
import com.example.studentservice.VO.ResponseTemplateVO;
import com.example.studentservice.enity.Student;
import com.example.studentservice.repository.StudentReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StudentService {
    @Autowired
    private StudentReposity studentReposity;
    private RestTemplate restTemplate;

    public Student saveStudent(Student student) {return studentReposity.save(student);}

    public ResponseTemplateVO getStudentWithKhoa(Long studentId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Student student = studentReposity.findById(studentId).get();
        vo.setStudent(student);
        Khoa khoa =
                restTemplate.getForObject("http://localhost:9001/khoa/" +student.getKhoaId(),Khoa.class);

        vo.setKhoa(khoa);
        return vo;
    }

}
