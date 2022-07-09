package com.martarello.teste.services;

import com.martarello.teste.entidades.Usuario;
import com.martarello.teste.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAllUsuario(){
        return usuarioRepository.findAll();
    }

    public Usuario findByIdUsuario(Long id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return usuario.get();
    }
}
