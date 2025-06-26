package com.task.demo.Service;
import java.util.List;

import com.task.demo.DTO.*;
public class ProyectoService {

    ProyectoResponseDTO registrarProyecto(ProyectoResponseDTO  proyectoResponseDTO );
    ProyectoResponseDTO  obtenerProyectosPorId(Long id);
    List<ProyectoResponseDTO> obtenerTodos();
}
