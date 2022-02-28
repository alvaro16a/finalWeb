package co.com.sofka.final_backend.models;

import javax.persistence.*;

@Entity(name = "tareas")
public class Task {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // se crea el id dotandolo de incremento automatico
    private Long id;

    @Column(length = 25, nullable = false, unique = true) // se crea el atributo nombre el cual debe ser unico, no puede
    private String name;                                                      // ser nulo y no puede tener mas de 15 caracteres
    


    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    /// Constructor///
    ///////////////////////////////////////////////////////////////////////////////////////////////////////


    public Task() {
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    /// getters y setters///
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

   
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
