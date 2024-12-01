package SGQ.services.implementation;

import SGQ.Entities.TipoCirugiaEntity;
import SGQ.repository.TipoCirugiaRepository;
import SGQ.services.TipoCirugiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCirugiaServiceImpl implements TipoCirugiaService {
    @Autowired
    private TipoCirugiaRepository tipocirugiaRepository;
    @Override
    public List<TipoCirugiaEntity> findAll(){
        return (List<TipoCirugiaEntity>) tipocirugiaRepository.findAll();
    }
    @Override
    public TipoCirugiaEntity save(TipoCirugiaEntity tipoCirugia){
        return tipocirugiaRepository.save(tipoCirugia);
    }
    @Override
    public TipoCirugiaEntity findById(Long Id){
        return tipocirugiaRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(TipoCirugiaEntity tipoCirugia){
        tipocirugiaRepository.delete(tipoCirugia);
    }
}
