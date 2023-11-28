package com.mock.demo.mbeans;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

@ManagedResource(objectName="com.stub.bean:name=httpDelay")
@Component
public class HttpDelay implements HttpDelayMXBean {

    private int intValue=2;

    @ManagedAttribute
    @Override
    public int getIntValue() {
        return this.intValue;
    }

    @ManagedAttribute
    @Override
    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}