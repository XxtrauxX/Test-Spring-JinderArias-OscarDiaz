package com.task.demo.Service;

import com.task.demo.DTO.UsuarioResponseDTO;
import com.task.demo.DTO.UsuarioRequestDTO;

import java.util.List;

public interface UsuarioService {
    UsuarioResponseDTO registrarUsuario(UsuarioRequestDTO usuarioRequest);
    UsuarioResponseDTO obtenerUsuarioPorId(Long id);
    List<UsuarioResponseDTO> obtenerTodos();
}
