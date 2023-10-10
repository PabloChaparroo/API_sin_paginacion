package com.project.API_sin_Paginacion.services.RubroArticuloService;

import com.project.API_sin_Paginacion.entities.RubroArticulo;
import com.project.API_sin_Paginacion.repositories.BaseRepository;
import com.project.API_sin_Paginacion.repositories.RubroArticuloRepository;
import com.project.API_sin_Paginacion.services.BaseService.BaseService;
import com.project.API_sin_Paginacion.services.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubroArticuloServiceImpl extends BaseServiceImpl<RubroArticulo,Long >  implements RubroArticuloService {
    @Autowired
    private RubroArticuloRepository rubroArticuloRepository;

    public RubroArticuloServiceImpl(BaseRepository<RubroArticulo, Long> baseRepository, RubroArticuloRepository rubroArticuloRepository) {
        super(baseRepository);
        this.rubroArticuloRepository = rubroArticuloRepository;
    }
}
