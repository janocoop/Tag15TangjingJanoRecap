package com.example.tag15tangjingjanorecap;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final Repository repo;


    public ToDoService(Repository repo) {
        this.repo = repo;
    }
//migros never, coop for ever
    public List<ToDo> findAll() {
        return repo.findAll();
    }

    public ToDo save(String id, NewToDo newTodo) {
        ToDo toSave = new ToDo(newTodo.content());
        return repo.save(toSave);
    }
}