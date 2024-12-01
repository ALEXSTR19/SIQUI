package SGQ.services;

import SGQ.Entities.UsersEntity;

import java.util.List;

public interface UsersService {
    List<UsersEntity> findAll();

    UsersEntity save(UsersEntity users);

    UsersEntity findById(Long Id);

    void delete(UsersEntity users);
}
