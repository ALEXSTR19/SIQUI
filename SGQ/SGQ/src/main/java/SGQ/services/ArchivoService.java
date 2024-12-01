package SGQ.services;

import SGQ.Entities.ArchivoEntity;

import java.util.List;

public interface ArchivoService {
    List<ArchivoEntity> findAll();

    ArchivoEntity save(ArchivoEntity archivo);

    ArchivoEntity findById(Long Id);

    void delete(ArchivoEntity archivo);
}
