package com.Kasun.Enterprices.First.Project.Service.IMPL;

import com.Kasun.Enterprices.First.Project.DTO.RequestDTO.RequestStudentDTO;
import com.Kasun.Enterprices.First.Project.DTO.ResponseDTO.ResponseStudentDTO;
import com.Kasun.Enterprices.First.Project.Service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIMPL implements StudentService {
    @Override
    public ResponseStudentDTO getStudent(RequestStudentDTO dto) {
        return new ResponseStudentDTO(
                dto.getFullName(),
                dto.getAge(),
                dto.getNic()
        );
    }
}
