package com.mock.demo;

import com.mock.demo.entity.StudentResponse;
import com.mock.demo.mbeans.delay.HttpDelay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class StudentService {

    @Autowired
    public HttpDelay httpDelay;


    public Mono<StudentResponse> getStudent(String firstName, String lastName, String status) {
        try {
            return Mono.just(new StudentResponse(firstName, lastName, status)).delayElement(Duration.ofMillis(genDelay(httpDelay.getStudentsDelay())));
        } catch (Exception e) {
            return Mono.error(e);
        }
    }

    public Mono<StudentResponse> testStudent() {
        try {
            return Mono.just(new StudentResponse()).delayElement(Duration.ofMillis(genDelay(httpDelay.getStudentsDelay())));
        } catch (Exception e) {
            return Mono.error(e);
        }
    }


    public int genDelay(int delay){
        int randomDelay = (int) ((Math.random() * (50+delay - delay)) + delay);
        return delay;
    }
}
