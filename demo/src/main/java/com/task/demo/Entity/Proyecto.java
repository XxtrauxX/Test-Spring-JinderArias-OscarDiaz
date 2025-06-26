package com.task.demo.Entity;

import java.time.LocalDate;

import com.task.demo.Entity.enums.EstadoProyecto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "proyecto")
@Data
@NoArgsConstructor
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_proyecto", nullable = false)
    private String nombreProyecto;

    @Column(name = "descripcion", nullable = false)
    private  String descripcion;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate FechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate FechaFin;

     @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoProyecto estado = EstadoProyecto.Activo;




}
