package org._9bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello. Korea"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello. Korea"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello. Korea"));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);


    }
}
