package com.project.API_sin_Paginacion.services.UnidadMedidaService;

import com.project.API_sin_Paginacion.entities.UnidadMedida;
import com.project.API_sin_Paginacion.repositories.BaseRepository;
import com.project.API_sin_Paginacion.repositories.UnidadMedidaRepository;
import com.project.API_sin_Paginacion.services.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida, Long> implements UnidadMedidaService {
    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    public UnidadMedidaServiceImpl(BaseRepository<UnidadMedida, Long> baseRepository, UnidadMedidaRepository unidadMedidaRepository) {
        super(baseRepository);
        this.unidadMedidaRepository = unidadMedidaRepository;
    }
}
