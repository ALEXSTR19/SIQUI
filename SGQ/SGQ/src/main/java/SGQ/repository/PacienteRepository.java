package SGQ.repository;

import SGQ.Entities.PacienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends CrudRepository<PacienteEntity, Long> {

}
