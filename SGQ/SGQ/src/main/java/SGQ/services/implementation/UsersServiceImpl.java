package SGQ.services.implementation;

import SGQ.Entities.UsersEntity;
import SGQ.repository.UsersRepository;
import SGQ.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;
    @Override
    public List<UsersEntity> findAll(){
        return (List<UsersEntity>) usersRepository.findAll();
    }
    @Override
    public UsersEntity save(UsersEntity users){
        return usersRepository.save(users);
    }
    @Override
    public UsersEntity findById(Long Id){
        return usersRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(UsersEntity users){
        usersRepository.delete(users);
    }
}
