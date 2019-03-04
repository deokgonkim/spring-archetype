package example.controller.data;

import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import example.service.DbService;

@Controller
@RequestMapping("/data/db")
@PreAuthorize("isAuthenticated()")
public class DbController {
    
    private static final Logger LOG = LoggerFactory.getLogger(DbController.class);
    
    @Autowired
    private DbService service = null;

    @RequestMapping("")
    public @ResponseBody List<String> getAllUsers() {
        List<String> strings = new LinkedList<>();
        try {
            String db_name = service.getDbName();
            strings.add(db_name);
            return strings;
        } catch (SQLException e) {
            LOG.error(e.getMessage(), e);
            return Collections.EMPTY_LIST;
        }
    }
}
