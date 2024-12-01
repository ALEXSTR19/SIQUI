package SGQ.services.implementation;

import SGQ.Entities.PacienteEntity;
import SGQ.repository.PacienteRepository;
import SGQ.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public List<PacienteEntity> findAll(){
        return (List<PacienteEntity>) pacienteRepository.findAll();
    }

    @Override
    public PacienteEntity save(PacienteEntity paciente){
        return pacienteRepository.save(paciente);
    }
    @Override
    public PacienteEntity findById(Long Id){
        return pacienteRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(PacienteEntity paciente){
        pacienteRepository.delete(paciente);
    }
}
