package com.methodref.staticexample;

public class MethodRefExStatic {

    public static void testMethod(String info){
        System.out.println(info);
    }

    public static void main(String args[]){

        // This is example for static method reference
        MethodRefStatic methodRefStatic = (String s)->System.out.println(s);
        methodRefStatic.getMessage("Print Hello MethodRef");

        MethodRefStatic methodRefStatic1 = MethodRefExStatic::testMethod;
        methodRefStatic1.getMessage("Print Hello Method Reference from TestMethod");
    }
}
