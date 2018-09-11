package guru.springframework.controllers;

import guru.springframework.repositories.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

//    @Autowired
    GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingsService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }

}
