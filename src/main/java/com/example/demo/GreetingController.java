package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.joda.time.LocalTime;

@Controller
public class GreetingController {
    LocalTime currentTime = new LocalTime();
    private int count = 0;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue=" default=greeting ") String name, Model model) {
        model.addAttribute("name", name + " count=" + ++count);
        return "greeting";
    }
    @GetMapping("/time")
    public String greetingTime(@RequestParam(name="name", required=false, defaultValue=" default=time ") String name, Model model) {
        model.addAttribute("name", name + " Time: " + currentTime);
        return "time";
    }
}