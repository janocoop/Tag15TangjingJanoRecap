package com.example.tag15tangjingjanorecap;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ToDoService {

    private final Repository repo;

    public ToDo add(ToDo task) {
        repo.save(task);
        return task;
    }

    //migros never, coop forever
    public List<ToDo> findAll() {
        return repo.findAll();
    }

    public ToDo meow(ToDo task) {
     repo.save(task);
        //   return repo.save(toSave);
        return task;
    }

}