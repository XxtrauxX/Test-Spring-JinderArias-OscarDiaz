package com.task.demo.DTO;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ProyectoResponseDTO {
    private Long id;
    private String nombreProyecto;
    private  String descripcion;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    private String estado;

}
