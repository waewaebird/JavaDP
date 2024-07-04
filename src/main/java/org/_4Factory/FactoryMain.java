package org._4Factory;

import org._4Factory.framework.Factory;
import org._4Factory.framework.Product;
import org._4Factory.idcard.IDCardFactory;

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
