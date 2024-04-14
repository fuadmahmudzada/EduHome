package org.example.edu2home.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
    @GetMapping("account/login")
    public String index(){
        return  "login";
    }
    @GetMapping("/account/signup")
    public String index2(){
        return "signup";
    }
}
