package SGQ.services.implementation;

import SGQ.Entities.EnfermeraInstrEntity;
import SGQ.repository.EnfermeraInstrRepository;
import SGQ.services.EnfermeraInstrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfermeraInstrServiceImpl implements EnfermeraInstrService {
    @Autowired
    private EnfermeraInstrRepository enfermerainstrRepository;

    @Override
    public List<EnfermeraInstrEntity> findAll(){
        return (List<EnfermeraInstrEntity>) enfermerainstrRepository.findAll();
    }
    @Override
    public EnfermeraInstrEntity save(EnfermeraInstrEntity enfermeraInstr){
        return enfermerainstrRepository.save(enfermeraInstr);
    }
    @Override
    public EnfermeraInstrEntity findById(Long Id){
        return enfermerainstrRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(EnfermeraInstrEntity enfermeraInstr){
        enfermerainstrRepository.delete(enfermeraInstr);
    }
}
