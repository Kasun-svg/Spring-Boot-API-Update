package com.Kasun.Enterprices.First.Project.Service;

import com.Kasun.Enterprices.First.Project.DTO.RequestDTO.RequestStudentDTO;
import com.Kasun.Enterprices.First.Project.DTO.ResponseDTO.ResponseStudentDTO;

import java.util.List;

public interface StudentService {

    public String saveStudent(RequestStudentDTO dto);

    List<ResponseStudentDTO> getAllStudent();

   String deleteStudent(long id);


   String updateStudent(RequestStudentDTO dto, long id);
}
