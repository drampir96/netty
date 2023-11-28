package com.mock.demo;

import com.mock.demo.entity.StudentResponse;
import com.mock.demo.mbeans.HttpDelay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class StudentService {

    @Autowired
    public HttpDelay httpDelay;


    public Mono<StudentResponse> getStudent(String firstName, String lastName, String status) {
        return Mono.just(new StudentResponse(firstName, lastName, status)).delayElement(Duration.ofSeconds(httpDelay.getIntValue()));
    }
}
