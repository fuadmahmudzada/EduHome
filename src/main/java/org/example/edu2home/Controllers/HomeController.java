package org.example.edu2home.Controllers;

import org.example.edu2home.models.Blog;
import org.example.edu2home.models.Slider;
import org.example.edu2home.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ServiceRepository serviceRepository;

    SliderRepository sliderRepository;
    BlogRepository blogRepository;
    CommentRepository commentRepository;
    AboutHomeRepository aboutHomeRepository;

    public HomeController(SliderRepository sliderRepository, BlogRepository blogRepository
    , CommentRepository commentRepository
    , AboutHomeRepository aboutHomeRepository){
        this.sliderRepository=sliderRepository;
        this.blogRepository=blogRepository;
        this.commentRepository = commentRepository;
        this.aboutHomeRepository = aboutHomeRepository;
    }


    @GetMapping("/")
    public String index(Model model){
//        List<Blog> blogs = blogRepository.findAll();
//        blogs.forEach(blog -> System.out.println(blog.getCreatedTime()));
        model.addAttribute("services",serviceRepository.findAll());
        model.addAttribute("sliders",sliderRepository.findAll());
        model.addAttribute("blogs",blogRepository.findAll());
        model.addAttribute("comments",commentRepository.findAll());
        model.addAttribute("aboutHomes",aboutHomeRepository.findAll());
        return "home";
    }

}
