package mx.uv.t4is.Saludos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludarControlador {
    @GetMapping("/saludo/{nombre}")
    public Saludador saluda(@PathVariable("nombre") String nombreX){
        return new Saludador(nombreX);
    }
}
