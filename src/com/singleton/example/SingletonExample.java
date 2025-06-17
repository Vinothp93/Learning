package com.singleton.example;

public class SingletonExample {

    public static void main(String args[]){

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getMsg());
    }

}
