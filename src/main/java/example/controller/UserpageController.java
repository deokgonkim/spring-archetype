package example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userpage")
@PreAuthorize("isAuthenticated()")
public class UserpageController {

    @RequestMapping("")
    public String index(ModelMap modelMap) {
        return "userpage/index";
    }
}
