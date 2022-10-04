package com.amazonaws.labs.sampleapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyClass{

    @Test
    public void testDataController() throws Exception {
        DataController dataController = new DataController();
        
        assertEquals(dataController.getTitle(), "A Sample web application:");
    }
}