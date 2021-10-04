package com.example.studentservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Khoa {
    private Long id;

    private String khoaName;
    private String khoaCode;
}
