package com.project.API_sin_Paginacion.services.ClienteService;

import com.project.API_sin_Paginacion.repositories.BaseRepository;
import com.project.API_sin_Paginacion.services.BaseService.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.API_sin_Paginacion.entities.Cliente;
import com.project.API_sin_Paginacion.repositories.ClienteRepository;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, Long> implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository, ClienteRepository clienteRepository) {
        super(baseRepository);
        this.clienteRepository = clienteRepository;
    }
}