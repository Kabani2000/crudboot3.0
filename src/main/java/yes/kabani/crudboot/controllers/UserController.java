package yes.kabani.crudboot.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import yes.kabani.crudboot.dto.UserDto;
import yes.kabani.crudboot.service.ServiceAbstractInterface;

@Controller
@RequestMapping("/user")
public class UserController {

    private final ServiceAbstractInterface<UserDto> serviceAbstractInterface;

    public UserController(ServiceAbstractInterface<UserDto> serviceAbstractInterface) {
        this.serviceAbstractInterface = serviceAbstractInterface;
    }

    @GetMapping
    public String getUserPage(Authentication authentication, Model model) {
        model.addAttribute("user", serviceAbstractInterface.getEntityByName(authentication.getName()));
        return "userPage";
    }
}
