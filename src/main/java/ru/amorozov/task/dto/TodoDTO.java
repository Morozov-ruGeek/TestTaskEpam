package ru.amorozov.task.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.task.models.Todo;

@Data
@NoArgsConstructor
public class TodoDTO {
    protected String username;
    private String description;

    public TodoDTO(Todo todo) {
        this.username = todo.getUser().getUsername();
        this.description = todo.getDescription();
    }
}
