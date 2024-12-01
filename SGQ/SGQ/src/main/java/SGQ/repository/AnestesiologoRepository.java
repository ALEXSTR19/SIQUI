package SGQ.repository;

import SGQ.Entities.AnestesiologoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnestesiologoRepository extends CrudRepository<AnestesiologoEntity, Long> {
}
