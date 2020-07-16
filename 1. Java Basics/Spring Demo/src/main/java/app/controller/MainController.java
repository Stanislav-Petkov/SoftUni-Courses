package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView hello(ModelAndView modelAndView){
        modelAndView.setViewName("hello.html");
        return modelAndView;
    }

    @GetMapping("/java")
    public ModelAndView java(ModelAndView modelAndView){
        modelAndView.setViewName("java.html");
        return modelAndView;
    }
}
