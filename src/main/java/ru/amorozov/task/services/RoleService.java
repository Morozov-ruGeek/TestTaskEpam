package ru.amorozov.task.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.amorozov.task.models.Role;
import ru.amorozov.task.repositories.RoleRepository;

import java.util.Collection;


@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository repository;

    public Collection<Role> findRoleByName(String roleName){
        return findRoleByName(roleName);
    }
}
