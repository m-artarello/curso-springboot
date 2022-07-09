package com.martarello.teste.repositories;

import com.martarello.teste.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Não tem necessidade pois o JPARespository já possui possui esse annotation
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
