package co.com.sofka.final_backend.repositories;

import org.springframework.data.repository.CrudRepository;

import co.com.sofka.final_backend.models.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {
    
}
