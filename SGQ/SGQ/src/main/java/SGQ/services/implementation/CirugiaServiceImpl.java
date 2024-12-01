package SGQ.services.implementation;

import SGQ.Entities.CirugiaEntity;
import SGQ.repository.CirugiaRepository;
import SGQ.services.CirugiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CirugiaServiceImpl implements CirugiaService {
    @Autowired
    private CirugiaRepository cirugiaRepository;

       @Override
    public List<CirugiaEntity> findAll(){
        return (List<CirugiaEntity>) cirugiaRepository.findAll();
    }

    @Override
    public CirugiaEntity save(CirugiaEntity cirugia){
        return cirugiaRepository.save(cirugia);
    }

    @Override
    public CirugiaEntity findById(Long Id){
        return cirugiaRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(CirugiaEntity cirugia){
        cirugiaRepository.delete(cirugia);
    }
}
