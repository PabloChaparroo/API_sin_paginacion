package com.project.API_sin_Paginacion.repositories;

import com.project.API_sin_Paginacion.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}
