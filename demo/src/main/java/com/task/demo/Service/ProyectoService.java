package com.task.demo.Service;
import java.util.List;

import com.task.demo.DTO.ProyectoResponseDTO;
public interface  ProyectoService {

    ProyectoResponseDTO registrarProyecto(ProyectoResponseDTO  proyectoResponseDTO) ;
    ProyectoResponseDTO  obtenerProyectoPorId(Long id);
    List<ProyectoResponseDTO> obtenerTodos();
}
