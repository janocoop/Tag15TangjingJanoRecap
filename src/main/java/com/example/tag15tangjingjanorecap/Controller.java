package com.example.tag15tangjingjanorecap;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor

public class Controller {

    private final ToDoService service;

    @GetMapping
    List<ToDo> findAll() {
        return service.findAll();
    }

    @PostMapping()
    ToDo save(@RequestBody NewToDo newTodo) {
        return service.save("content", newTodo);
    }

}