package SGQ.services;

import SGQ.Entities.CirujanoEntity;

import java.util.List;

public interface CirujanoService {
    List<CirujanoEntity> findAll();

    CirujanoEntity save(CirujanoEntity cirujano);

    CirujanoEntity findById(Long Id);

    void delete(CirujanoEntity cirujano);
}
