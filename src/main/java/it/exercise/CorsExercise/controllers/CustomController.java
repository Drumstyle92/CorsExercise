package it.exercise.CorsExercise.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Drumstyle92
 * Controller class that exposes an endpoint that can be accessed via a GET request
 */
@RestController
public class CustomController {

    /**
     * @return Returns a string welcoming the visitor
     * response to the GET request. Also, the controller is made to enable
     * access to the service by a client who has a local server where the React app is running
     */
    @GetMapping("/custom")
    @CrossOrigin(origins = "http://localhost:3000")
    public String custom() {

        return "Welcome visitor!";

    }

}
