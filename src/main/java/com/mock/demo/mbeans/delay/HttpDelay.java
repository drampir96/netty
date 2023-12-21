package com.mock.demo.mbeans.delay;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@ManagedResource(objectName="com.stub.bean.http:name=Delay")
@Component
public class HttpDelay implements HttpDelayMXBean {

    private int studentsDelay = 200;

    @ManagedAttribute
    @Override
    public int getStudentsDelay() {
        return this.studentsDelay;
    }

    @ManagedAttribute
    @Override
    public void setStudentsDelay(int studentsDelay) {
        this.studentsDelay = studentsDelay;
    }
}