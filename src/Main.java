import models.*;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        Director director = new Director();
        Cooker cooker = new Cooker();

        director.force(cooker);
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("I am cooker from interface, and i am cooking");
            }
        });

        System.out.println();
        
        Employee employee = new Employee();
        director.force(employee,6);

        director.force(new Counter() {
            @Override
            public String report(final int months) {
                return "There is report for " + months + " months";
            }
        },12);
    }
}
