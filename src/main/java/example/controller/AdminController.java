package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    
    @RequestMapping("")
    public String index(ModelMap modelMap) {
        return "admin/index";
    }
}
