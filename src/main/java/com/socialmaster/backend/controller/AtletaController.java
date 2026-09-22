package com.socialmaster.backend.controller;

import com.socialmaster.backend.entity.Atleta;
import com.socialmaster.backend.service.AtletaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //Essa classe vai receber requisições HTTP e devolver dados
@RequestMapping("/atletas") //define nossa primeira rota:

public class AtletaController {

    private final AtletaService atletaService;

    public AtletaController(AtletaService atletaService) {
        this.atletaService = atletaService;

    }

    @GetMapping
    public List<Atleta> getAtletas() {
        return atletaService.listarTodos();
    }

}
