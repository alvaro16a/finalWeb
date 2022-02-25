package co.com.sofka.final_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import co.com.sofka.final_backend.models.*;

public interface ActionRepository extends JpaRepository<Action, Long>{
    
}
