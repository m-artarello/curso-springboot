package com.martarello.teste.config;

import com.martarello.teste.entidades.Usuario;
import com.martarello.teste.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario1 = new Usuario(null, "Matheus Martarello", "matheus@gmail.com", "988888888", "123456");
        Usuario usuario2 = new Usuario(null, "João Pedro", "joao@gmail.com", "977777777", "123456");

        usuarioRepository.saveAll(Arrays.asList(usuario1, usuario2));
    }
}
