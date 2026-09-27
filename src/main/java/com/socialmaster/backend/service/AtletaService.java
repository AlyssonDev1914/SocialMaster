package com.socialmaster.backend.service;

import com.socialmaster.backend.AtletaNotFoundException;
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
        return atletaRepository.findById(id)
                .orElseThrow(() -> new AtletaNotFoundException("Atleta não encontrado"));
    }

    public Atleta atualizar(Long id, Atleta  atletaAtualizado){

        Atleta atleta = atletaRepository.findById(id)
                .orElseThrow(() -> new AtletaNotFoundException("Atleta não encontrado"));

        atleta.setNome(atletaAtualizado.getNome());
        atleta.setEmail(atletaAtualizado.getEmail());
        atleta.setDataNascimento(atletaAtualizado.getDataNascimento());
        atleta.setFaixa(atletaAtualizado.getFaixa());
        atleta.setPeso(atletaAtualizado.getPeso());

        return atletaRepository.save(atleta);


    }


}
