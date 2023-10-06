package com.project.API_sin_Paginacion.controllers;

import com.project.API_sin_Paginacion.entities.Usuario;
import com.project.API_sin_Paginacion.services.Usuario.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/usuarioController")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {
}
