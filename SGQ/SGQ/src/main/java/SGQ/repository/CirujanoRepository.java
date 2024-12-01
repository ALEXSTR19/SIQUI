package SGQ.repository;

import SGQ.Entities.CirujanoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CirujanoRepository extends CrudRepository<CirujanoEntity,Long> {
}
