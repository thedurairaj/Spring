package com.rd.spring.lesson7_scope.request;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope(value = "request")
@RestController
public class OrderController {

    private final RequestTracker tracker;

    public OrderController(RequestTracker tracker) {
        this.tracker = tracker;
    }

    @GetMapping("/order")
    public String order() {
        return tracker.getId() + " | " + tracker.getId();
    }
}
