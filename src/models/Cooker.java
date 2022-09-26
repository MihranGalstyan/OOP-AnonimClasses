package models;

import models.Cookable;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Cooker implements Cookable {
    @Override
    public void cook() {
        System.out.println("I am cooking");
    }
}
