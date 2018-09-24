package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeDataSource2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by jd on 2018.09.21..
 */
@Configuration
@PropertySource({"classpath:datasource.properties","classpath:datasource2.properties"})
//@PropertySources({  @PropertySource("classpath:datasource.properties"),
//                    @PropertySource("classpath:datasource2.properties")})
public class PropertyConfig {

    @Autowired
    Environment env; //for environment variables ex. JAVA_HOME

    @Value("${guru.username}")
    String user;

    @Value("${guru.password}")  //based on the active profile (ex. spring.profiles.active=de)
    String password;           //the value is going to be loaded from application-de.properties (if exists!!!)

    @Value("${guru.dburl}")
    String url;

    @Value("${guru2.jms.username}")
    String user2;

    @Value("${guru2.jms.password}")
    String password2;

    @Value("${guru2.jms.dburl}")
    String url2;

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySPC = new PropertySourcesPlaceholderConfigurer();
        return propertySPC;
    }

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource(env.getProperty("JAVA_HOME"), password, url);
        return fakeDataSource;
    }

    @Bean
    public FakeDataSource2 fakeDataSource2() {
        FakeDataSource2 fakeDataSource = new FakeDataSource2(user2, password2, url2);
        return fakeDataSource;
    }
}
