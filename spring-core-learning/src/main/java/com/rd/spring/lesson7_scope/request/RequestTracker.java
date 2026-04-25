package com.rd.spring.lesson7_scope.request;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "request")
public class RequestTracker {
    int count;

    public RequestTracker() {
        System.out.println("RequestTracker created");
    }

    public String getId() {
        return "REQ-" + count++;
    }
}
