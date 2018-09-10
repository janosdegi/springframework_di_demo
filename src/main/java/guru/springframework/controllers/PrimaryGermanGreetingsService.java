package guru.springframework.controllers;


import guru.springframework.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }

}
