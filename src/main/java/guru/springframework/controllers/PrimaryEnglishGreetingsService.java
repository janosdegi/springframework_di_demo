package guru.springframework.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Dégi János on 2018.09.04..
 */
@Service
@Primary
@Profile({"en", "default"})
public class PrimaryEnglishGreetingsService implements GreetingsService {

    public String sayGreeting() {
        return "Primary Greetings service";
    }

}
