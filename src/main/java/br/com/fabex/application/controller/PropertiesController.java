package br.com.fabex.application.controller;

import br.com.fabex.application.properties.Integration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/properties")
public class PropertiesController {

    @Autowired
    private Integration integration;

    @GetMapping
    public Object get() {
        return integration;
    }
}
