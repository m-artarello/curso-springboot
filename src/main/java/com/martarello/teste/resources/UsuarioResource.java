package com.martarello.teste.resources;

import com.martarello.teste.entidades.Usuario;
import com.martarello.teste.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List> findAllUsuario(){
        List<Usuario> usuarios = usuarioService.findAllUsuario();

        return ResponseEntity.ok().body(usuarios);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findByIdUsuario(@PathVariable Long id){
        Usuario usuario = usuarioService.findByIdUsuario(id);
        return ResponseEntity.ok().body(usuario);
    }




}
