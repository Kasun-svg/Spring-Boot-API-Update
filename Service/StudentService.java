package com.Kasun.Enterprices.First.Project.Service;

import com.Kasun.Enterprices.First.Project.DTO.RequestDTO.RequestStudentDTO;
import com.Kasun.Enterprices.First.Project.DTO.ResponseDTO.ResponseStudentDTO;

public interface StudentService {

    public ResponseStudentDTO getStudent(RequestStudentDTO dto);
}
