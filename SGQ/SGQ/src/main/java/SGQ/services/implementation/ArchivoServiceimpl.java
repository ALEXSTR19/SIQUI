package SGQ.services.implementation;

import SGQ.Entities.ArchivoEntity;
import SGQ.repository.ArchivoRepository;
import SGQ.services.ArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArchivoServiceimpl implements ArchivoService {
    @Autowired
    private ArchivoRepository archivoRepository;

    @Override
    public List<ArchivoEntity> findAll(){
        return (List<ArchivoEntity>) archivoRepository.findAll();
    }
    @Override
    public ArchivoEntity save(ArchivoEntity archivo){
        return archivoRepository.save(archivo);
    }

    @Override
    public ArchivoEntity findById(Long Id){
        return archivoRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(ArchivoEntity archivo){
        archivoRepository.delete(archivo);
    }
}
