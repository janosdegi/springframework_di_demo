package guru.springframework.examplebeans;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jd on 2018.09.27..
 */
public class SpringBootApplicationPropertyDataSourceTest {

    SpringBootApplicationPropertyDataSource springBootAppPropDataSource;

    @Before
    public void setUp() {
        springBootAppPropDataSource = new SpringBootApplicationPropertyDataSource();
    }

    @Test
    public void getApplicationName() throws Exception {
        String appName = "di-demo";

        springBootAppPropDataSource.setApplicationName("di-demo");

        assertEquals("test msg", appName, springBootAppPropDataSource.getApplicationName() );
    }

    @Test
    public void getApplicationUrl() throws Exception {

    }

    @Test
    public void getApplicationUser() throws Exception {

    }

}