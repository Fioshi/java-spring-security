package med.voll.web_application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loadPageList(){
        return "authentication/login";
    }
    @GetMapping("/logout")
    public String loadLogOutPage(){
        return "authentication/logout";
    }
}
