package com.Kasun.Enterprices.First.Project.Controller;


import com.Kasun.Enterprices.First.Project.DTO.RequestDTO.RequestStudentDTO;
import com.Kasun.Enterprices.First.Project.DTO.ResponseDTO.ResponseStudentDTO;
import com.Kasun.Enterprices.First.Project.Service.StudentService;
import com.Kasun.Enterprices.First.Project.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable_;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(path = "/api/v1/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping(path = "/Save")
    private ResponseEntity<StandardResponse> userDetails(
            @RequestBody RequestStudentDTO dto
            ){


       return new ResponseEntity<>(new StandardResponse(
                "Data Received",
        200,
studentService.saveStudent(dto)

               ),
               HttpStatus.OK);
    }

    @GetMapping(path = "/get-all")
private ResponseEntity<StandardResponse>getStudentDetails(){
        return new ResponseEntity<>(new StandardResponse(
                "Data Fetched" ,
                200,
               studentService.getAllStudent()
        ),
                HttpStatus.OK);
}

@DeleteMapping(path = "/Delete/{id}")
private ResponseEntity<StandardResponse> deleteStudent(
        @PathVariable long id
){
        return new ResponseEntity<>(new StandardResponse(
            "Record Deleted",
            404,
              studentService.deleteStudent(id)
        ),
            HttpStatus.OK);
}

    @PutMapping(path = "/update/{id}")
    private ResponseEntity<StandardResponse> updateStudent(
            @RequestBody RequestStudentDTO dto,
            @PathVariable long id
    ){


        return new ResponseEntity<>(new StandardResponse(
                "Data Received",
                200,
                studentService.updateStudent(dto,id)

        ),
                HttpStatus.OK);

    }
}
