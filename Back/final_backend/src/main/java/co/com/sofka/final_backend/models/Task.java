package co.com.sofka.final_backend.models;
import java.util.List;

import javax.persistence.*;

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //se crea el id dotandolo de incremento automatico
    private Long id;

    @Column(length = 15, nullable=false, unique=true) //se crea el atributo nombre el cual debe ser unico, no puede ser nulo y no puede tener mas de 15 caracteres
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "task")
    private List<Action> actions;
    
}
