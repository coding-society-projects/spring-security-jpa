package com.example.springsecurityjpa;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>User Dashboard</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Admin Dashboard</h1>");
    }

    @GetMapping("/customer")
    public String customer() {
        return ("<h1>Shopping cart</h1>");
    }

    @GetMapping("/password")
    public String password() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = bCryptPasswordEncoder.encode("pass");
        return encodedPassword;
    }

}
