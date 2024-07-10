package io.github.lucasedson.taskmanager.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskControl {
    
    @GetMapping("/")
    public String mainPage(){
        return "Rota Inicial";
    }
}
