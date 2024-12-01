package SGQ.services.implementation;

import SGQ.Entities.RolesEntity;
import SGQ.repository.RolesRepository;
import SGQ.services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;
    @Override
    public List<RolesEntity> findAll(){
        return (List<RolesEntity>) rolesRepository.findAll();
    }
    @Override
    public RolesEntity save(RolesEntity roles){
        return rolesRepository.save(roles);
    }
    @Override
    public RolesEntity findById(Long Id){
        return rolesRepository.findById(Id).orElse(null);
    }
    @Override
    public void delete(RolesEntity roles){
        rolesRepository.delete(roles);
    }
}
