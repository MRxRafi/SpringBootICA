package controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class ServicioEjemplo {
    @GetMapping(value="saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludar() {
        return "Bienvenido a mi servicio";
    }
}
