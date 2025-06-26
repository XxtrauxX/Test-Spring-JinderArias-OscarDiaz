package com.task.demo.Service;
import java.util.List;

import com.task.demo.DTO.*;

public interface  TareaService {
    TareaResponseDTO registarTarea(TareaResponseDTO tareaResponseDTO);
    TareaResponseDTO obtenerTareaPorId(Long id);
    List<TareaResponseDTO> obtenerTodos();
    
}
