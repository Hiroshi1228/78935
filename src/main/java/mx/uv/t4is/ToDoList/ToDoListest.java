package mx.uv.t4is.ToDoList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//DTO
@Entity
public class ToDoListest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;
    private String tarea;
    private String tipoT;

    public String getTarea() {
        return tarea;
    }

    public String getTipoT() {
        return tipoT;
    }

    public int getNo(){
        return no;
    }

    public void setNo(int no){
        this.no = no;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public void setTipoT(String tipoT) {
        this.tipoT = tipoT;
    }
    
}
