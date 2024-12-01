package SGQ.repository;

import SGQ.Entities.EnfermeraInstrEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfermeraInstrRepository extends CrudRepository<EnfermeraInstrEntity,Long> {
}
