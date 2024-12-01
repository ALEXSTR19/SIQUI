package SGQ.repository;

import SGQ.Entities.AnestesiaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnestesiaRepository extends CrudRepository<AnestesiaEntity, Long> {
}
