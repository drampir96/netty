package com.mock.demo.mbeans.code;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@ManagedResource(objectName="com.stub.bean.http:name=Code")
@Component
public class HttpCode implements  HttpCodeMXBean{
    private int studentsHttpCode=200;

    @ManagedAttribute
    @Override
    public int getStudentsHttpCode() {
        return this.studentsHttpCode;
    }

    @ManagedAttribute
    @Override
    public void setStudentsHttpCode(int studentsHttpCode) {
        this.studentsHttpCode = studentsHttpCode;
    }
}
