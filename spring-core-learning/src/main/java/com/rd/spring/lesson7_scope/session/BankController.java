package com.rd.spring.lesson7_scope.session;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope("session")
@RestController
public class BankController {

    private final UserSession session;

    public BankController(UserSession session) {
        this.session = session;
    }

    @GetMapping("/loginA")
    public String loginA() {
        session.setUser("UserA", 1000);
        return "UserA logged in";
    }

    @GetMapping("/loginB")
    public String loginB() {
        session.setUser("UserB", 2000);
        return "UserB logged in";
    }

    @GetMapping("/balance")
    public String balance() {
        return session.getUsername() + " Balance: " + session.getBalance();
    }

    @GetMapping("/deposit")
    public String deposit() {
        session.deposit(500);
        return "Amount deposited";
    }
}
