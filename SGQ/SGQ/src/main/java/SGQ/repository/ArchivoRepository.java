package SGQ.repository;

import SGQ.Entities.ArchivoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivoRepository extends CrudRepository<ArchivoEntity,Long> {
}
