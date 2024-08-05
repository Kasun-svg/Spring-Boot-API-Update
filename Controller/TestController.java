package com.Kasun.Enterprices.First.Project.Controller;


import com.Kasun.Enterprices.First.Project.Service.TestService;
import com.Kasun.Enterprices.First.Project.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/test")
public class TestController {

    @Autowired
    private TestService t1;

    @GetMapping(path = "/message")
    private ResponseEntity<StandardResponse> message() {

        String data = t1.getMessage();

        return  new ResponseEntity<>(new StandardResponse(
                "Successfully API worked",
                200,
                data
        ), HttpStatus.OK);





    }
}

