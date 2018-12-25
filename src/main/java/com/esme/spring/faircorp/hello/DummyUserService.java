package com.esme.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DummyUserService implements UserService{

    @Autowired
    private GreetingService greetingService;

    public void setGreetingService(GreetingService service) {
        this.greetingService = service;
    }

    public void greetAll(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Nurbol");
        names.add("Bakyt");
        for (String name:names) {
            greetingService.greet(name);
        }
    }
}
