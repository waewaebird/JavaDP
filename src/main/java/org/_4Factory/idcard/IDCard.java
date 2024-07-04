package org._4Factory.idcard;

import org._4Factory.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    public String toString() {
        return "[IDCard:]" + owner + "]";
    }

    public String getOwner(){
        return owner;
    }
}
