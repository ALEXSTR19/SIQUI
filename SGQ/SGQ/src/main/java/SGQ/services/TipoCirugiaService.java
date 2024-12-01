package SGQ.services;

import SGQ.Entities.TipoCirugiaEntity;

import java.util.List;

public interface TipoCirugiaService {
    List<TipoCirugiaEntity> findAll();

    TipoCirugiaEntity save(TipoCirugiaEntity tipoCirugia);

    TipoCirugiaEntity findById(Long Id);

    void delete(TipoCirugiaEntity tipoCirugia);

}
