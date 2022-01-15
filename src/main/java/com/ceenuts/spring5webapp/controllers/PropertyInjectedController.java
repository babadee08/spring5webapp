package com.ceenuts.spring5webapp.controllers;

import com.ceenuts.spring5webapp.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
