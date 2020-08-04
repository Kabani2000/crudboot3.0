package yes.kabani.crudboot.repository;

import org.springframework.data.repository.CrudRepository;
import yes.kabani.crudboot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Integer> {

    Optional<User> findById(Long id);

    Optional<User> findByName(String name);

    List<User> findAll();

    void deleteById(Long id);
}
