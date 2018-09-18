package guru.springframework.controllers;

import guru.springframework.repositories.GreetingRepository;

/**
 * Created by jd on 2018.09.18..
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingsService createGreetingService(String lang) {

        switch (lang){
            case "en":
                return new PrimaryEnglishGreetingsService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingsService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingsService(greetingRepository);
            default:
                return new PrimaryEnglishGreetingsService(greetingRepository);
        }

    }

}
