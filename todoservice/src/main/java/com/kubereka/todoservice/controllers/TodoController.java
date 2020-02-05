package com.kubereka.todoservice.controllers;

import com.kubereka.todoservice.models.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("todos")
public class TodoController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    List<Todo> getTodos(){
        return Arrays.asList(
                new Todo(1, "First Todo"),
                new Todo(2, "Second Todo")
        );
    }
}
