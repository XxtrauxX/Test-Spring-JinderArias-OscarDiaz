package com.task.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.task.demo.DTO.*;
import java.util.List;
import com.task.demo.Service.*;
@RestController
@RequestMapping("api/v1/proyecto")
@CrossOrigin
public class ProyectoController {
    @Autowired ProyectoService proyectoService;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<ProyectoResponseDTO> registrarProyecto(@RequestBody ProyectoRequestDTO proyectoRequest) {
        ProyectoResponseDTO nuevoProyecto = proyectoService.registrarProyecto(proyectoResponseDTO);
        return new ResponseEntity<>(nuevoProyecto, HttpStatus.CREATED);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR','COLABORADOR')")
    public ResponseEntity<List<ProyectoResponseDTO>> obtenerTodos() {
        return ResponseEntity.ok(proyectoService.obtenerTodos());
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR','COLABORADOR')")
    public ResponseEntity<UsuarioResponseDTO> obtenerProyectoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(proyectoService.obtenerProyectoPorId(id));
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<Void> eliminarProyectoPorId(@PathVariable Long id) {
        try {
            proyectoService.eliminarProyectoPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
