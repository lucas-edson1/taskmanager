package io.github.lucasedson.taskmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.github.lucasedson.taskmanager.model.Mensagem;
import io.github.lucasedson.taskmanager.model.TaskModel;
import io.github.lucasedson.taskmanager.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired 
    private Mensagem msg;

    @Autowired 
    private TaskRepository rep;

    public ResponseEntity<TaskModel> cadastrar(TaskModel obj){
        return new ResponseEntity<>(rep.save(obj), HttpStatus.CREATED);
    }
}
