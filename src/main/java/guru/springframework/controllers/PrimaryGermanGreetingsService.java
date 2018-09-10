package guru.springframework.controllers;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Dégi János on 2018.09.10..
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingsService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Primärer Grußdienst";
    }

}
