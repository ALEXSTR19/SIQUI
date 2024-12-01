package SGQ.services.implementation;

import SGQ.Entities.EnfermeraCircuEntity;
import SGQ.Entities.EnfermeraInstrEntity;
import SGQ.repository.EnfermeraCircuRepository;
import SGQ.services.EnfermeraCircuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfermeraCircuServiceImpl implements EnfermeraCircuService {
    @Autowired
    private EnfermeraCircuRepository enfermeracircuRepository;


    @Override
    public List<EnfermeraCircuEntity> findAll(){
        return(List<EnfermeraCircuEntity>) enfermeracircuRepository.findAll();
    }
    @Override
    public EnfermeraCircuEntity save(EnfermeraCircuEntity enfermeraCircu){
        return enfermeracircuRepository.save(enfermeraCircu);
    }
    @Override
    public EnfermeraCircuEntity findById(Long Id){
        return enfermeracircuRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(EnfermeraCircuEntity enfermeraCircu){
        enfermeracircuRepository.delete(enfermeraCircu);
    }
}
