package ru.amorozov.task.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.task.models.User;

@Data
@NoArgsConstructor
public class NewUserRegistrationDto {
    private String username;
    private String password;
    private String role;

    public NewUserRegistrationDto(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.role = String.valueOf(user.getRoles());
    }
}
