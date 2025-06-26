package com.task.demo.Entity;

import java.time.LocalDate;


import com.task.demo.Entity.enums.EstadoTarea;
import com.task.demo.Entity.enums.PrioridadTarea;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_tarea", nullable = false)
    private String nombreTarea;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "prioridad", nullable = false)
    private PrioridadTarea prioridad;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoTarea estado;

    @Column(name = "fecha_vencimineto", nullable = false)
    private LocalDate FechaVencimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_asignado", nullable = false)
    private Usuario usuarioAsignado;




    

    

}
