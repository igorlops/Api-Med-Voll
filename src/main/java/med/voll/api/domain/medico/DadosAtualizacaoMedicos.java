package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicos(
    @NotNull
    Long id, 
    String nome, 
    String telefone, 
    DadosEndereco endereco) {

}
