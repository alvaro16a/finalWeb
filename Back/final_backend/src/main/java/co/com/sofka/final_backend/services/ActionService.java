package co.com.sofka.final_backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.com.sofka.final_backend.repositories.*;
import co.com.sofka.final_backend.models.*;

@Service
public class ActionService {

    @Autowired
    ActionRepository repository;

    public Iterable<Action> listActions(){
        return repository.findAll();
    }

    public Action save(Action action){
        return repository.save(action);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public void deleteAll(){
        repository.deleteAll();
    }

    public Action get(Long id){
         return repository.findById(id).orElseThrow();
    }

    public Action saveActionWithTask(Task task, String nombre){
         Action action = new Action(nombre,false,task);
         repository.save(action);
         repository.flush();
         return action;
    }

}
