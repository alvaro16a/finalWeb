package co.com.sofka.final_backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.com.sofka.final_backend.services.*;
import co.com.sofka.final_backend.models.*;

@RestController
// @CrossOrigin(origins = "http://localhost:3000") //permite las solicitudes
// desde esta URL
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ActionService actionService;

    @Autowired
    private TaskService taskservice;

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    /// task functions///
    ///////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping(value = "/tasks") // se obtienen todas las acciones
    public Iterable<Task> ListTask() {
        return taskservice.listTasks();
    }

    @PostMapping(value = "/task") // crea una nueva accion
    public Task save(@RequestBody Task task) {
        return taskservice.save(task);
    }

    @DeleteMapping(value = "/task/{id}") // elimina una tarea por su id
    public void deleteTask(@PathVariable("id") Long id) {
        taskservice.delete(id);
    }

    @GetMapping(value = "/task/{id}") // obtiene una tarea al saber su id
    public Task getTask(@PathVariable("id") Long id) {
        return taskservice.get(id);
    }

    @DeleteMapping(value = "/tasks") // elimina todas las acciones
    public void deleteTaskAll() {
        taskservice.deleteAll();
    }

    @PutMapping(value = "/task") // modifica una tarea en caso de existir el id
    public Task updateTask(@RequestBody Task task) {
        if (task.getId() != null) {
            return taskservice.save(task);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    /// action functions///
    ///////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping(value = "/actions") // se obtienen todas las acciones
    public Iterable<Action> List() {
        return actionService.listActions();
    }

    @PostMapping(value = "/action") // crea una nueva accion
    public Action save(@RequestBody Action action) {
        action.setCompleted(false);
        return actionService.save(action);
    }

    @PutMapping(value = "/action") // modifica una accion en caso de existir el id
    public Action update(@RequestBody Action action) {
        if (action.getId() != null) {
            return actionService.save(action);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "/action/{id}") // elimina una accion al resivir su id
    public void delete(@PathVariable("id") Long id) {
        actionService.delete(id);
    }

    @DeleteMapping(value = "/actions") // elimina todas las acciones
    public void deleteAll() {
        actionService.deleteAll();
        ;
    }

    @GetMapping(value = "/action/{id}") // obtiene una accion al saber su id
    public Action get(@PathVariable("id") Long id) {
        return actionService.get(id);
    }

}
