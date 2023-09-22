package clin.med.api.paciente;

public record DadosListarPaciente(String nome, String email, String cpf) {

    public DadosListarPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
