package co.com.sofka.final_backend.models;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //se crea el id dotandolo de incremento automatico
    private Long id;

    @Column(length = 30, nullable=false, unique=true) //se crea el atributo nombre el cual debe ser unico, no puede ser nulo y no puede tener mas de 30 caracteres
    private String name;

    @Column(nullable = false) //se crea el atributo nombre el cual debe ser unico, no puede ser nulo y no puede tener mas de 30 caracteres
    private Boolean completed;

    public Long getId() { //se generaron getter y setter para todos los atributos excepto para el setter para el id que no puede ser modificado por nadie
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
    
}
