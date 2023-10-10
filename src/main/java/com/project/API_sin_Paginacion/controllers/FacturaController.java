package com.project.API_sin_Paginacion.controllers;

import com.project.API_sin_Paginacion.entities.Factura;
import com.project.API_sin_Paginacion.services.FacturaService.FacturaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl> {
}
