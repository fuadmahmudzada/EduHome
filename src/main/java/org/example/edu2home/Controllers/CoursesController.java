package org.example.edu2home.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoursesController {
    @GetMapping("/courses")
    public String index(){
        return "courses";
    }
    @GetMapping("/courses/details")
    public String index2(){
        return "courseDetails";
    }
}
