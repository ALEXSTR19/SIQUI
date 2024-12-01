package SGQ.services;

import SGQ.Entities.AnestesiaEntity;

import java.util.List;

public interface AnestesiaService {
    List<AnestesiaEntity> findAll();

    AnestesiaEntity save(AnestesiaEntity anestesia);

    AnestesiaEntity findById(Long Id);

    void delete(AnestesiaEntity anestesia);
}
