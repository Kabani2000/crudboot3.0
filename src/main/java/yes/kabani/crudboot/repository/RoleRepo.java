package yes.kabani.crudboot.repository;

import org.springframework.data.repository.CrudRepository;
import yes.kabani.crudboot.model.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepo extends CrudRepository<Role, Integer> {

    List<Role> findAll();

    Optional<Role> findByNameRole(String nameRole);

    Role findById(Long id);
}
