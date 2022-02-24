package co.com.sofka.final_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.sofka.final_backend.models.Task;
import co.com.sofka.final_backend.repositories.TaskRepository;

@Service
public class TaskService {

    @Autowired
    TaskRepository repository;

    public Iterable<Task> listTasks() {
        return repository.findAll();
    }

    public Task save(Task task) {
        return repository.save(task);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
        }
    }

    public Task get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public void deleteAll() {
       repository.deleteAll();
    }

    /*
     * public void deleteTask(Long id){
     * repository.deleteById(id);
     * }
     * 
     * /* public void deleteAll(){
     * repository.deleteAll();
     * }
     * 
     * public Task get(Long id){
     * return repository.findById(id).orElseThrow();
     * }
     * 
     * /* public Task addTask(Task task,Action action){
     * task.getActions().add(action);
     * repository.save(task);
     * return task;
     * }
     * 
     * public Task subtractTask(Task task,Action action){
     * task.getActions().removeIf((Action _action) -> _action.getId() ==
     * action.getId());
     * repository.save(task);
     * return task;
     * }
     */
}
