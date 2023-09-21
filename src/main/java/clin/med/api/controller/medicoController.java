package clin.med.api.controller;

import clin.med.api.medico.DadosCadastroMedico;
import clin.med.api.medico.Medico;
import clin.med.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class medicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrarMedico(@RequestBody DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }

}
