package clin.med.api.controller;

import clin.med.api.domain.consulta.AgendaDeConsultas;
import clin.med.api.domain.consulta.DadosAgendamentoConsulta;
import clin.med.api.domain.consulta.DadosCancelamentoConsulta;
import clin.med.api.domain.consulta.DadosDetalhamentoConsulta;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

    @Autowired
    private AgendaDeConsultas consulta;

    @PostMapping
    @Transactional
    public ResponseEntity agendar(@RequestBody @Valid DadosAgendamentoConsulta dados) {
        consulta.agendarConsulta(dados);

        return ResponseEntity.ok(new DadosDetalhamentoConsulta(null, null, null, null));
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity cancelar(@RequestBody @Valid DadosCancelamentoConsulta dados) {
        consulta.cancelar(dados);
        return ResponseEntity.noContent().build();
    }
}
