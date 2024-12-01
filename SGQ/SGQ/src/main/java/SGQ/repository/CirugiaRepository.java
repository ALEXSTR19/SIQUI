package SGQ.repository;

import SGQ.Entities.CirugiaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CirugiaRepository extends CrudRepository<CirugiaEntity, Long> {
}
