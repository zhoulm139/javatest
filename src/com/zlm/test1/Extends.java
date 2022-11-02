package com.zlm.test1;

public class Extends {

    static abstract class Bird {
        void fly() {
            System.out.println("i can fly");
        }

        abstract void eat();
    }

    static class Laoying extends Bird implements Interfaces.Animal {

        void fly() {
//            super.fly();
            System.out.println("i can fly very high");
        }

        @Override
        void eat() {
            System.out.println("i eat rabbit");
        }

        @Override
        public void cry() {
            System.out.println("ao ao ao");
        }
    }

    public static void main(String[] args) {
        Laoying d = new Laoying();
        d.fly();
        d.eat();
        d.cry();
    }

}
