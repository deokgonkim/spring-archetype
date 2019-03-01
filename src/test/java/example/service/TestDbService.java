package example.service;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/context-*.xml"
})
public class TestDbService {

    private static final Logger LOG = LoggerFactory.getLogger(TestDbService.class);
    
    @Autowired
    private DbService service = null;
    
    @Test
    public void test() {
        Date now = null;
        try {
            now = service.getNow();
            assertNotNull(now);
            LOG.info(now.toString());
        } catch(SQLException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDbName() {
        String name = null;
        try {
            name = service.getDbName();
            assertNotNull(name);
            LOG.info(name);
        } catch(SQLException e) {
            fail(e.getMessage());
        }
    }

}
