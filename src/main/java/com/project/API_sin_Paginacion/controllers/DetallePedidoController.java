package com.project.API_sin_Paginacion.controllers;

import com.project.API_sin_Paginacion.entities.DetallePedido;
import com.project.API_sin_Paginacion.services.DetallePedido.DetallePedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detallePedidos")
public class DetallePedidoController extends BaseControllerImpl<DetallePedido, DetallePedidoServiceImpl> {
}
