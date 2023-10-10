package com.project.API_sin_Paginacion.controllers;

import com.project.API_sin_Paginacion.entities.ArticuloManufacturado;
import com.project.API_sin_Paginacion.services.ArticuloManufacturadoService.ArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/articuloManufacturado")
public class ArticuloManufacturadoController extends  BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {
}
