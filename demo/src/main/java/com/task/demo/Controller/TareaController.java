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



@RestController
@RequestMapping("api/v1/tarea")
@CrossOrigin
public class TareaController {
    @Autowired TareaService tareaService;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<TareaResponseDTO> registrarTarea(@RequestBody TareaRequestDTO tareaRequest) {
        UsuarioResponseDTO nuevaTarea = tareaService.registrarTarea(tareaRequest);
        return new ResponseEntity<>(nuevaTarea, HttpStatus.CREATED);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR','COLABORADOR')")
    public ResponseEntity<List<TareaResponseDTO>> obtenerTodos() {
        return ResponseEntity.ok(tareaService.obtenerTodos());
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR','COLABORADOR')")
    public ResponseEntity<TareaResponseDTO> obtenerUsuarioPorId(@PathVariable Long id) {
        return ResponseEntity.ok(tareaService.obtenerUsuarioPorId(id));
    }

    
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public ResponseEntity<Void> eliminarTarea(@PathVariable Long id) {
        try {
            tareaService.eliminarTareaPorId(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }    
}
