package com.example.studentservice.VO;

import com.example.studentservice.enity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Student student;
    private Khoa khoa;

}
