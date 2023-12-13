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

    @PutMapping()
    ToDo meow(@RequestBody ToDo task) {
        return service.meow(task);
    }


    @PostMapping("/todo")
    public ToDo add(@RequestBody ToDo task){
       return service.add(task);
    }}




