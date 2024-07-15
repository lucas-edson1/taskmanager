package io.github.lucasedson.taskmanager.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.github.lucasedson.taskmanager.model.TaskModel;

public interface TaskRepository extends CrudRepository<TaskModel, Integer>{
    List<TaskModel> findAll();
    
}
