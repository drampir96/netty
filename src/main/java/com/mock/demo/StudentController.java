package com.mock.demo;

import com.mock.demo.entity.StudentRequest;
import com.mock.demo.entity.StudentResponse;
import com.mock.demo.mbeans.code.HttpCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {


    public StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }


    @PostMapping(
            value = "/students",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Mono<StudentResponse> getStudent(@RequestBody StudentRequest studentRequest) {
        return service.getStudent(studentRequest.getFirstName(), studentRequest.getLastName(), "passed");
    }

    @GetMapping(
            value = "/test")
    public Mono<StudentResponse> testStudent() {
        return service.testStudent();
    }


}
