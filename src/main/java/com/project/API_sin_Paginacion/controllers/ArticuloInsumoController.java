package com.project.API_sin_Paginacion.controllers;


import com.project.API_sin_Paginacion.entities.ArticuloInsumo;
import com.project.API_sin_Paginacion.services.ArticuloInsumoService.ArticuloInsumoServiceImpl;
import com.project.API_sin_Paginacion.services.ClienteService.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/articuloInsumos")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoServiceImpl> {
}
