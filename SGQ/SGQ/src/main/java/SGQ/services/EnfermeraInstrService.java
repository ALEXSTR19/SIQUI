package SGQ.services;

import SGQ.Entities.EnfermeraInstrEntity;


import java.util.List;

public interface EnfermeraInstrService {
    List<EnfermeraInstrEntity> findAll();

    EnfermeraInstrEntity save(EnfermeraInstrEntity enfermeraInstr);

    EnfermeraInstrEntity findById(Long Id);

    void delete(EnfermeraInstrEntity enfermeraInstr);
}
