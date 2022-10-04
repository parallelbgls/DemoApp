package com.amazonaws.labs.sampleapp;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {
    private final static Logger LOGGER = Logger.getLogger(DataController.class.getName());
    
    @RequestMapping(value = "/title", method = RequestMethod.GET)
    public String getTitle() {
        LOGGER.info("Get Title");
        return "A Sample web application:";
    }
}