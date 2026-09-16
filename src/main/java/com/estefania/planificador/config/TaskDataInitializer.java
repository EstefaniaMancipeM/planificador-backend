package com.estefania.planificador.config;

import java.time.LocalDate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.estefania.planificador.model.Task;
import com.estefania.planificador.repository.TaskRepository;

@Configuration
public class TaskDataInitializer {
    @Bean
    CommandLineRunner loadMyFirstTasks(TaskRepository repository) {
        return args -> {
            if (repository.count() > 0) return;
            repository.save(new Task("Practicar portugues", "Repasar vocabulario y completar una leccion de practica.", LocalDate.of(2026, 8, 18), "PENDING"));
            repository.save(new Task("Organizar el mercado", "Preparar la lista de alimentos para la semana.", LocalDate.of(2026, 8, 19), "PENDING"));
            repository.save(new Task("Repasar la clase de Java", "Revisar los apuntes y practicar los ejercicios de clase.", LocalDate.of(2026, 8, 21), "IN_PROGRESS"));
            repository.save(new Task("Actualizar mi hoja de vida", "Agregar los cursos recientes y revisar mis datos de contacto.", LocalDate.of(2026, 8, 23), "PENDING"));
            repository.save(new Task("Hacer mantenimiento al computador", "Organizar archivos y eliminar programas que ya no utilizo.", LocalDate.of(2026, 8, 12), "DONE"));
        };
    }
}
