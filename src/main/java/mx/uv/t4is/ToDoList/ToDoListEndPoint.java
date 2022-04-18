package mx.uv.t4is.ToDoList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.toDoList.BorrarToDoListRequest;
import https.t4is_uv_mx.toDoList.BorrarToDoListResponse;
import https.t4is_uv_mx.toDoList.BuscarToDoListResponse;
import https.t4is_uv_mx.toDoList.ModificarToDoListRequest;
import https.t4is_uv_mx.toDoList.ModificarToDoListResponse;
import https.t4is_uv_mx.toDoList.ToDoListRequest;
import https.t4is_uv_mx.toDoList.ToDoListResponse;

@Endpoint
public class ToDoListEndPoint {

    @Autowired
    ItoDoListest itoDoListest;

    @PayloadRoot(localPart = "ToDoListRequest", namespace = "https://t4is.uv.mx/toDoList")
    @ResponsePayload
    public ToDoListResponse ToDoList(@RequestPayload ToDoListRequest peticion) {
        ToDoListResponse respuesta = new ToDoListResponse();
        respuesta.setRespuesta("Tienes que " + peticion.getTarea() + " catalogado como " + peticion.getTipoT());
        ToDoListest e = new ToDoListest();
        e.setTarea(peticion.getTarea());
        e.setTipoT(peticion.getTipoT());
        itoDoListest.save(e);
        return respuesta;
    }

    @PayloadRoot(localPart = "BuscarToDoListRequest", namespace = "https://t4is.uv.mx/toDoList")
    @ResponsePayload
    public BuscarToDoListResponse buscarToDoList() {
        BuscarToDoListResponse respuesta = new BuscarToDoListResponse();
        Iterable<ToDoListest> lista = itoDoListest.findAll();
        for (ToDoListest o : lista) {
            BuscarToDoListResponse.Tareas e = new BuscarToDoListResponse.Tareas();
            e.setTarea(o.getTarea());
            e.setTipoT(o.getTipoT());
            e.setNo(o.getNo());
            respuesta.getTareas().add(e);
        }
        return respuesta; 
    }

    @PayloadRoot(localPart = "ModificarToDoListRequest", namespace = "https://t4is.uv.mx/toDoList")
    @ResponsePayload
    public ModificarToDoListResponse modificarToDoList(@RequestPayload ModificarToDoListRequest peticion) {
        ModificarToDoListResponse respuesta = new ModificarToDoListResponse();
        ToDoListest e = new ToDoListest();
        e.setNo(peticion.getNo());
        e.setTarea(peticion.getTarea());
        e.setTipoT(peticion.getTipoT());
        itoDoListest.save(e);
        respuesta.setRespuesta(true);
        return respuesta;
    }

    @PayloadRoot(localPart = "BorrarToDoListRequest", namespace = "https://t4is.uv.mx/toDoList")
    @ResponsePayload
    public BorrarToDoListResponse borrarToDoList(@RequestPayload BorrarToDoListRequest peticion) {
        BorrarToDoListResponse respuesta = new BorrarToDoListResponse();
        itoDoListest.deleteById(peticion.getNo());
        respuesta.setRespuesta(true);
        return respuesta;
    }
}