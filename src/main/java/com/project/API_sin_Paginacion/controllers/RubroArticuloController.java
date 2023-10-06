package com.project.API_sin_Paginacion.controllers;

import com.project.API_sin_Paginacion.entities.RubroArticulo;
import com.project.API_sin_Paginacion.services.RubroArticuloService.RubroArticuloServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubroArticulo")
public class RubroArticuloController extends BaseControllerImpl<RubroArticulo, RubroArticuloServiceImpl> {
}
