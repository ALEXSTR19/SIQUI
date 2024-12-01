package SGQ.services;

import SGQ.Entities.PacienteEntity;

import java.util.List;

public interface PacienteService {


    List<PacienteEntity> findAll();

    PacienteEntity save(PacienteEntity paciente);

    PacienteEntity findById(Long Id);

    void delete(PacienteEntity paciente);
}
