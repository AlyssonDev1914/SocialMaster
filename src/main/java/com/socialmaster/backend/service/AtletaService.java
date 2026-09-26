package com.socialmaster.backend.service;

import com.socialmaster.backend.entity.Atleta;
import com.socialmaster.backend.repository.AtletaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AtletaService {
    private final AtletaRepository atletaRepository;

    public AtletaService(AtletaRepository atletaRepository) {
        this.atletaRepository = atletaRepository;

    }

    public List<Atleta> listarTodos() {
        return atletaRepository.findAll();
    }

    public Atleta salvar(Atleta atleta) {
        return atletaRepository.save(atleta);

    }

    public Atleta buscarPorId(Long id) {
        return atletaRepository.findById(id).orElseThrow(() -> new RuntimeException("Atleta não encontrado (a) "));
    }

}
