package clin.med.api.controller;

import clin.med.api.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class medicoController {
    @PostMapping
    public void cadastrarMedico(@RequestBody DadosCadastroMedico dados){
        System.out.println(dados);
    }

}