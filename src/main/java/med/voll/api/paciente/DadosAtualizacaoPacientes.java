package med.voll.api.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.api.medico.DadosEndereco;

public record DadosAtualizacaoPacientes(
    @NotNull
    Long id, 
    String nome, 
    String telefone, 
    DadosEndereco endereco) {

}
