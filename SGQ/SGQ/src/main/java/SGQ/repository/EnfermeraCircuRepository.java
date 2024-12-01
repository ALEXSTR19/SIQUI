package SGQ.repository;

import SGQ.Entities.EnfermeraCircuEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfermeraCircuRepository extends CrudRepository<EnfermeraCircuEntity,Long> {
}
