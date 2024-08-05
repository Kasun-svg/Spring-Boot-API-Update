package com.Kasun.Enterprices.First.Project.Service.IMPL;

import com.Kasun.Enterprices.First.Project.Service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceIMPL implements TestService {
    @Override
    public String getMessage() {
        return "welcome to 1st project";







    }
}
