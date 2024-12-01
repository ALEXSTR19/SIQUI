package SGQ.repository;

import SGQ.Entities.TipoCirugiaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCirugiaRepository extends CrudRepository<TipoCirugiaEntity,Long> {
}
