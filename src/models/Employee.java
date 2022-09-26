package models;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Employee implements Counter{
    @Override
    public String report(final int months) {
        return "There is report for " + months + " months";
    }
}
