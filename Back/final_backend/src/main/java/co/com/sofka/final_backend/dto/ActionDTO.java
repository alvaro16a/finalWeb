package co.com.sofka.final_backend.dto;

import java.io.Serializable;




public class ActionDTO implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id_action;
    private Boolean compleId;
    private String name_action;
    private Long action_id;
    private Long acciones;

    public ActionDTO() {
    }

    public Long getId_action() {
        return id_action;
    }

    public void setId_action(Long id_action) {
        this.id_action = id_action;
    }

    public Boolean getCompleId() {
        return compleId;
    }

    public void setCompleId(Boolean compleId) {
        this.compleId = compleId;
    }

    public String getName_action() {
        return name_action;
    }

    public void setName_action(String name_action) {
        this.name_action = name_action;
    }

    public Long getAction_id() {
        return action_id;
    }

    public void setAction_id(Long action_id) {
        this.action_id = action_id;
    }

    public Long getAcciones() {
        return acciones;
    }

    public void setAcciones(Long acciones) {
        this.acciones = acciones;
    }

     
    
    

    

    

    
}
