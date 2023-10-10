package com.project.API_sin_Paginacion.services.FacturaService;


import com.project.API_sin_Paginacion.entities.Factura;
import com.project.API_sin_Paginacion.repositories.BaseRepository;
import com.project.API_sin_Paginacion.repositories.FacturaRepository;
import com.project.API_sin_Paginacion.services.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura,Long> implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }
}