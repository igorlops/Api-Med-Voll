package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.databind.ser.std.StdArraySerializers.LongArraySerializer;

public interface ConsultaRepository extends JpaRepository<Consulta,LongArraySerializer>{

}
