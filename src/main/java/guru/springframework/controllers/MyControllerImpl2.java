package guru.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Dégi János on 2018.09.04..
 */
@Controller
public class MyControllerImpl2 implements MyController {

    public String hello() {
        System.out.println("Hello2");
        return "";
    }

}
