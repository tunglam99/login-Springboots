package com.codegym.login.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UserController {
    public static final String DEFAULT_ROLE = "ROLE_USER";
    public static final String TEXT = "To confirm account click here :"
            + "http://localhost:5000/confirm-account?token=";
    public static String SUBJECT = "Đăng ký thành công";
}
