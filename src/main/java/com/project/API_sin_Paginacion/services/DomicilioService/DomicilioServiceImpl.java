package com.project.API_sin_Paginacion.services.DomicilioService;

import com.project.API_sin_Paginacion.entities.Domicilio;
import com.project.API_sin_Paginacion.repositories.BaseRepository;
import com.project.API_sin_Paginacion.repositories.DomicilioRepository;
import com.project.API_sin_Paginacion.services.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
