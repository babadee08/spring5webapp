package com.ceenuts.spring5webapp.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nService")
@Scope("prototype")
public class I18nSpanishGreetingService implements GreetingService {

    @Value("${foo.email}")
    private String email;

    @Override
    public String sayGreeting() {
        return "Hola Mundo!!! - ES";
    }

    public String getEmail() {
        return email;
    }
}
