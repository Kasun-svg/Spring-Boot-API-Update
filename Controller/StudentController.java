package com.Kasun.Enterprices.First.Project.Controller;


import com.Kasun.Enterprices.First.Project.DTO.RequestDTO.RequestStudentDTO;
import com.Kasun.Enterprices.First.Project.Service.StudentService;
import com.Kasun.Enterprices.First.Project.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping(path = "/user")
    private ResponseEntity<StandardResponse> userDetails(
            @RequestBody RequestStudentDTO dto
            ){

       return new ResponseEntity<>(new StandardResponse(
                "Data Received",
        200,
        dto.getNic()
       ),
               HttpStatus.OK);



    }




}
