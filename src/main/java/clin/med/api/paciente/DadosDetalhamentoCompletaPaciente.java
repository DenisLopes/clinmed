package clin.med.api.paciente;

import clin.med.api.endereco.Endereco;

public record DadosDetalhamentoCompletaPaciente(String nome, String email, String telefone, String cpf, Endereco endereco) {
    public DadosDetalhamentoCompletaPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }
}
