package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Dégi János on 2018.09.04..
 */
@Controller
public class TestControllerImpl {

    @Autowired
    @Qualifier("myControllerImpl2")
    MyController myContr;

    public String hello() {
        myContr.hello();
        return "foo";
    }

}
