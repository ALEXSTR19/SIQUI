package SGQ.services;

import SGQ.Entities.RolesEntity;

import javax.management.relation.Role;
import java.util.List;

public interface RolesService {
    List<RolesEntity> findAll();

    RolesEntity save(RolesEntity roles);

    RolesEntity findById(Long Id);

    void delete(RolesEntity roles);
}
