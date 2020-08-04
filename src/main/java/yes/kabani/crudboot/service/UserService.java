package yes.kabani.crudboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import yes.kabani.crudboot.dto.UserDto;

public interface UserService extends ServiceAbstractInterface<UserDto>, UserDetailsService {

}
