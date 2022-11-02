package com.zlm.test1;

public class Interfaces {
    interface Animal {
        void cry();
    }

    static class Dog implements Animal {
        public Dog() {

        }
        @Override
        public void cry() {
            System.out.println("wangwangwang..");
        }
    }

    static class Pig implements Animal {
        public Pig() {

        }
        @Override
        public void cry() {
            System.out.println("henghengheng..");
        }
    }

    public static void animalCry(Animal animal) {
        animal.cry();
    }

    public static void main(String[] args) {
        Animal animal = new Dog();
        animalCry(new Dog());
        animalCry(new Pig());
    }
}
