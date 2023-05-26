package med.voll.api.domain.consulta;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer;

public interface ConsultaRepository extends JpaRepository<Consulta,LongArraySerializer>{

    boolean existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(Long idMedico, LocalDateTime data);
    boolean existsByPacienteIdAndDataBetween(Long idPaciente, LocalDateTime primeiroHorario,
            LocalDateTime ultimoHorario);
}
