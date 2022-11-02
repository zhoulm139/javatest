package com.zlm.test1;

public class Student {
    public String name;
    private Integer age = 0;

    public Integer getAge() {
        return age;
    }

    public Student() {

    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void love(String name, Integer age) {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }

    public void love(String name) {
        int a = 1;
        int b = 1;
        int c = 2;
        if(a == b) {
            System.out.println("a=b");
        } else if(a == c) {
            System.out.println("a=c");
        } else {
            System.out.println("...");
        }

        if(a == b) {
            System.out.println("a=b");
        }

        if(a == c) {
            System.out.println("a=c");
        }

        switch (a) {
            case 1:  System.out.println("a=1"); break;
            case 2: System.out.println("a=2"); break;
            default: break;
        }

        if(name.equals("wxx")) {

        }

        int i=0;
        for(;i<10;) {
            i++;
            System.out.println(this.name + " love " +  name);
        }

        while (i<10) {
            System.out.println(this.name + " love " +  name);
            i++;
        }
    }

}
