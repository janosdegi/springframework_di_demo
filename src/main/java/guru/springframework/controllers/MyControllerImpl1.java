package guru.springframework.controllers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

/**
 * Created by Dégi János on 2018.09.04..
 */
@Controller
@Primary
public class MyControllerImpl1 implements MyController {

    public String hello() {
        System.out.println("Hello1 - @Primary");
        return "";
    }

}
