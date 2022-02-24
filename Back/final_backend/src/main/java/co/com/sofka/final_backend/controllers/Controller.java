package co.com.sofka.final_backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import co.com.sofka.final_backend.services.*;
import co.com.sofka.final_backend.models.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000") //permite las solicitudes desde esta URL
@RequestMapping("/api")
public class Controller {

    @Autowired
    private ActionService actionService;

    @GetMapping(value = "/actions")   //se obtienen todas las acciones
    public Iterable<Action> List(){
        return actionService.listActions();
    }

    @PostMapping(value = "/action")     //crea una nueva accion
    public Action save(@RequestBody Action action){
        return actionService.save(action);
    }

    @PutMapping(value = "/action")      //modifica una accion en caso de existir el id
    public Action update(@RequestBody Action action){
        if(action.getId() != null){
            return actionService.save(action);;
        }
        throw new RuntimeException("No existe el id para actualizar");
    }
    
    @DeleteMapping(value = "/action/{id}") //elimina una accion al resivir su id
    public void delete(@PathVariable("id") Long id){
        actionService.delete(id);
    }

    @DeleteMapping(value = "/actions") //elimina todas las acciones
    public void deleteAll(){
        actionService.deleteAll();;
    }
    
    @GetMapping(value = "/action/{id}")     //obtiene una accion al saber su id
    public Action get(@PathVariable("id") Long id){
        return actionService.get(id);
    }
    
}
