package com.mock.demo;

import com.mock.demo.entity.StudentRequest;
import com.mock.demo.entity.StudentResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {

    public final StudentService service;

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
            value = "/students")
    public Mono<StudentResponse> setDelay(@RequestBody StudentRequest studentRequest) {
        return service.getStudent(studentRequest.getFirstName(), studentRequest.getLastName(), "passed");
    }

}
