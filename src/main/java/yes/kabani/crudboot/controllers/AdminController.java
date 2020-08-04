package yes.kabani.crudboot.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import yes.kabani.crudboot.dto.UserDto;
import yes.kabani.crudboot.service.ServiceAbstractInterface;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final ServiceAbstractInterface<UserDto> serviceAbstractInterface;

    public AdminController(ServiceAbstractInterface<UserDto> serviceAbstractInterface) {
        this.serviceAbstractInterface = serviceAbstractInterface;
    }

    @GetMapping
    public String getMainPage(Authentication authentication, Model model) {

        model.addAttribute("user", serviceAbstractInterface.getEntityByName(authentication.getName()));
        return "table";
    }
}
