package com.task.demo.Service;
import java.util.List;

import com.task.demo.DTO.*;

public class TareaService {
    TareaResponseDTO registarTarea(TareaResponseDTO tareaResponseDTO);
    TareaResponseDTO obtenerTareaPorId(Long id);
    List<TareaResponseDTO> obtenerTodos();
    
}
