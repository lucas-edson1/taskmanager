package io.github.lucasedson.taskmanager.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.github.lucasedson.taskmanager.model.TaskModel;
import io.github.lucasedson.taskmanager.repository.TaskRepository;
import io.github.lucasedson.taskmanager.service.TaskService;

@RestController
public class TaskControl {
    
    @Autowired 
    private TaskService servico;

    @Autowired
    private TaskRepository repository;

    @GetMapping("/")
    public String mainPage(){
        return "Rota Inicial";
    }

    @GetMapping("/listar")
    public List<TaskModel> listar(){
        return repository.findAll();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<TaskModel> cadastrar(@RequestBody TaskModel obj){
        return servico.cadastrar(obj);
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody TaskModel obj){
        return servico.alterar(obj);
    }
}
