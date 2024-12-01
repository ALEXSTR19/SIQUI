package SGQ.services.implementation;

import SGQ.Entities.AnestesiologoEntity;
import SGQ.repository.AnestesiologoRepository;
import SGQ.services.AnestesiologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnestesiologoServiceImpl implements AnestesiologoService {
    @Autowired
    private AnestesiologoRepository anestesiologoRepository;

    @Override
    public List<AnestesiologoEntity> findAll(){
        return (List<AnestesiologoEntity>) anestesiologoRepository.findAll();
    }
    @Override
    public AnestesiologoEntity save(AnestesiologoEntity anestesiologo){
        return anestesiologoRepository.save(anestesiologo);
    }
    @Override
    public AnestesiologoEntity findById(Long Id){
        return anestesiologoRepository.findById(Id).orElse(null);
    }
    @Override
    public  void delete(AnestesiologoEntity anestesiologo){
        anestesiologoRepository.delete(anestesiologo);
    }
}
