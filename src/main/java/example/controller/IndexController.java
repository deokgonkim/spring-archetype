package example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    private static final Logger LOG = LoggerFactory.getLogger(IndexController.class);
    
    @RequestMapping("")
    public String index(ModelMap modelMap) {
        return "home";
    }
}
