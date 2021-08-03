package ru.amorozov.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.amorozov.task.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
