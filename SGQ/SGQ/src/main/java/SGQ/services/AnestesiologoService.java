package SGQ.services;

import SGQ.Entities.AnestesiologoEntity;

import java.util.List;

public interface AnestesiologoService {
    List<AnestesiologoEntity> findAll();

    AnestesiologoEntity save(AnestesiologoEntity anestesiologo);

    AnestesiologoEntity findById(Long Id);

    void delete(AnestesiologoEntity anestesiologo);
}
