package guru.springframework.config;

import guru.springframework.examplebeans.SpringBootApplicationPropertyDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jd on 2018.09.21..
 */
@Configuration
public class SpringBootApplicationPropertyConfig {

    @Value("${app.name}") //directly from application.properties without PropertySourcesPlaceholderConfigurer
    private String applicationName;

    @Value("${app.url}")
    private String applicationUrl;

    @Value("${app.user}")
    private String applicationUser;

    @Bean
    public SpringBootApplicationPropertyDataSource springBootApplicationPropertyDTO() {
        SpringBootApplicationPropertyDataSource springBootApplicationPropertyDTO =
                new SpringBootApplicationPropertyDataSource(applicationName, applicationUrl, applicationUser);
        return springBootApplicationPropertyDTO;
    }

}
