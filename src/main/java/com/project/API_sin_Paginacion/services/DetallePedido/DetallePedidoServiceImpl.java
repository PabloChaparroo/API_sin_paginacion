package com.project.API_sin_Paginacion.services.DetallePedido;

import com.project.API_sin_Paginacion.entities.DetallePedido;
import com.project.API_sin_Paginacion.repositories.BaseRepository;
import com.project.API_sin_Paginacion.repositories.DetallePedidoRepository;
import com.project.API_sin_Paginacion.services.BaseService.BaseServiceImpl;
import com.project.API_sin_Paginacion.services.DetalleFacturaService.DetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoServiceImpl extends BaseServiceImpl<DetallePedido, Long>  implements DetallePedidoService {
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoServiceImpl(BaseRepository<DetallePedido, Long> baseRepository, DetallePedidoRepository detallePedidoRepository) {
        super(baseRepository);
        this.detallePedidoRepository = detallePedidoRepository;
    }
}
