package SGQ.services.implementation;

import SGQ.Entities.AnestesiaEntity;
import SGQ.repository.AnestesiaRepository;
import SGQ.services.AnestesiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnestesiaServiceImpl implements AnestesiaService {
    @Autowired
    private AnestesiaRepository anestesiaRepository;
    @Override
    public List<AnestesiaEntity> findAll(){
        return (List<AnestesiaEntity>) anestesiaRepository.findAll();
    }
    @Override
    public AnestesiaEntity save(AnestesiaEntity anestesia){
        return anestesiaRepository.save(anestesia);
    }
    @Override
    public AnestesiaEntity findById(Long Id){
        return anestesiaRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(AnestesiaEntity anestesia){
        anestesiaRepository.delete(anestesia);
    }
}
