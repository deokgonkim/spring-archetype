package example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
    
    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("")
    public @ResponseBody String hello() {
        LOG.debug("hello is called");
        return "Hello World";
    }
}
