package ru.amorozov.task.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.amorozov.task.dto.TodoDTO;
import ru.amorozov.task.error_handling.ResourceNotFoundException;
import ru.amorozov.task.models.Todo;
import ru.amorozov.task.models.User;
import ru.amorozov.task.repositories.TodoRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    private final UserService userService;

    @Transactional
    public TodoDTO saveTodo(TodoDTO todoDTO){
        Todo todo = new Todo();
        todo.setDescription(todoDTO.getDescription());
        Optional<User> user =  Optional.ofNullable(userService.findByUsername(todoDTO.getUsername()).orElseThrow(() -> new ResourceNotFoundException("Todo doesn't exists todoDTO.getUsername = " + todoDTO.getUsername() + " (Todo creation)")));
        todo.setUser(user.get());
        todoRepository.save(todo);
        return new TodoDTO(todo);
    }
}
