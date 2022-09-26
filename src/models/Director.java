package models;

import models.Cookable;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Director {
    public void force (Cookable cookable){
        cookable.cook();
    }

    public void force (Counter counter, int months){
        System.out.println(counter.report(months));
    }
}
