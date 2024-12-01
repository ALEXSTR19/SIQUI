package SGQ.services;

import SGQ.Entities.EnfermeraCircuEntity;
import SGQ.Entities.PacienteEntity;

import java.util.List;

public interface EnfermeraCircuService {
    List<EnfermeraCircuEntity> findAll();

    EnfermeraCircuEntity save(EnfermeraCircuEntity enfermeraCircu);

    EnfermeraCircuEntity findById(Long Id);

    void delete(EnfermeraCircuEntity enfermeraCircu);


}
