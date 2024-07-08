package org._5singleton;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("obj1과 obj2는 같습니다.");
        } else {
            System.out.println("다릅니다.");
        }
        System.out.println("End");
    }
}
