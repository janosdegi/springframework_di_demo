package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Dégi János on 2018.09.04..
 */
@Controller
public class ProfileTestImpl {

    @Autowired
    GreetingsService greetingsService;  // two @Primary implemetations exist which will be autowired?
                                        // based on resources/application.properties spring.profiles.active AND @Profile("")

    public String sayGreeting() {
        return greetingsService.sayGreeting();
    }


}
