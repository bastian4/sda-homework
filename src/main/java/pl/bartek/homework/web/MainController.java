package pl.bartek.homework.web;

import org.springframework.web.bind.annotation.GetMapping;


public class MainController {
    @GetMapping(value = "/main")
    public String mainPage() {
        return "main";
    }

}
