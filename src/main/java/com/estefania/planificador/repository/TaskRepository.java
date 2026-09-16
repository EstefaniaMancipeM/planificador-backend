package com.estefania.planificador.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estefania.planificador.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
