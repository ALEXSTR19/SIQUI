package SGQ.services.implementation;

import SGQ.Entities.CirujanoEntity;
import SGQ.repository.CirujanoRepository;
import SGQ.services.CirujanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CirujanoServiceImpl implements CirujanoService {
    @Autowired
    private CirujanoRepository cirujanoRepository;

    @Override
    public List<CirujanoEntity> findAll(){
        return (List<CirujanoEntity>) cirujanoRepository.findAll();
    }
    @Override
    public CirujanoEntity save(CirujanoEntity cirujano){
        return cirujanoRepository.save(cirujano);
    }
    @Override
    public CirujanoEntity findById(Long Id){
        return cirujanoRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(CirujanoEntity cirujano){
        cirujanoRepository.delete(cirujano);
    }

}
