package ru.amorozov.task.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.amorozov.task.dto.TodoDTO;
import ru.amorozov.task.services.TodoService;

@RestController
@RequestMapping("/api/v1/todos")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewTodo(@RequestBody TodoDTO todoDTO){
        todoService.saveTodo(todoDTO);
    }
}
