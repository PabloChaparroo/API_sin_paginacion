package com.project.API_sin_Paginacion.services.ArticuloManufacturadoService;

import com.project.API_sin_Paginacion.entities.ArticuloManufacturado;
import com.project.API_sin_Paginacion.repositories.ArticuloManufacturadoRepository;
import com.project.API_sin_Paginacion.repositories.BaseRepository;
import com.project.API_sin_Paginacion.services.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoServiceImpl extends BaseServiceImpl<ArticuloManufacturado, Long> implements ArticuloManufacturadoService {
    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;

    public ArticuloManufacturadoServiceImpl(BaseRepository<ArticuloManufacturado, Long> baseRepository, ArticuloManufacturadoRepository articuloManufacturadoRepository) {
        super(baseRepository);
        this.articuloManufacturadoRepository = articuloManufacturadoRepository;
    }
}
