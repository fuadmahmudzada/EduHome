package org.example.edu2home.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogsController {
    @GetMapping("/blogs")
    public String index(){
        return "blogs";
    }
}
