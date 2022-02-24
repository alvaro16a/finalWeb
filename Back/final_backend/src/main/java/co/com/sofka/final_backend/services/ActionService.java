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

    public Action save(Action todo){
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public Action get(Long id){
         return repository.findById(id).orElseThrow();
    }
    
}
