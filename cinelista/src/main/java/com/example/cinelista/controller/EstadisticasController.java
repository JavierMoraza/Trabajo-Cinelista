package com.example.cinelista.controller;

import com.example.cinelista.model.Estadistica;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EstadisticasController {

    private static final List<Estadistica> ESTADISTICAS = List.of(
            new Estadistica(1L, "Nebula Roja", "Ciencia ficcion", 82_000_000L, 8),
            new Estadistica(2L, "El Ultimo Faro", "Drama", 15_000_000L, 9),
            new Estadistica(3L, "Codigo Fantasma", "Thriller", 47_000_000L, 7),
            new Estadistica(4L, "Risas de Medianoche", "Comedia", 23_000_000L, 6),
            new Estadistica(5L, "Fuego Cruzado", "Accion", 96_000_000L, 8)
    );

    @GetMapping("/estadisticas")
    public String estadisticas() {
        return "estadisticas";
    }

    @GetMapping("/api/estadisticas")
    @ResponseBody
    public List<Estadistica> apiEstadisticas() {
        return ESTADISTICAS;
    }
}
