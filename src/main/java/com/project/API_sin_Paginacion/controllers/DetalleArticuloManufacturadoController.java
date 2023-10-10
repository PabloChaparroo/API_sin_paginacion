package com.project.API_sin_Paginacion.controllers;

import com.project.API_sin_Paginacion.entities.DetalleArticuloManufacturado;
import com.project.API_sin_Paginacion.services.DetalleArticuloManufacturadoService.DetalleArticuloManufacturadoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detalleArticuloManufacturados")
public class DetalleArticuloManufacturadoController extends BaseControllerImpl<DetalleArticuloManufacturado, DetalleArticuloManufacturadoServiceImpl> {
}
