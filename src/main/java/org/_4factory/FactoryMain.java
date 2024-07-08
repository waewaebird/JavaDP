package org._4factory;

import org._4factory.framework.Factory;
import org._4factory.framework.Product;
import org._4factory.idcard.IDCardFactory;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("KIM");
        Product card2 = factory.create("SON");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();
    }
}
