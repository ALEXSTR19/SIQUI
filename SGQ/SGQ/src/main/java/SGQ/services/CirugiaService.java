package SGQ.services;

import SGQ.Entities.CirugiaEntity;
import SGQ.Entities.CirujanoEntity;
import SGQ.repository.CirugiaRepository;

import java.util.List;

public interface CirugiaService {
    List<CirugiaEntity> findAll();

    CirugiaEntity save(CirugiaEntity cirugia);

    CirugiaEntity findById(Long Id);

    void delete(CirugiaEntity cirugia);
}
