package com.methodref.objectexample;

class Addition {

    public void sum(int a, int b){
        System.out.println("The sum of: " +(a+b));
    }
}

public class MethodRefObjIns{

    public static void main(String args[]){

        Addition addition = new Addition();
        MethodRefObject methodRefObject = ((a,b) -> System.out.println("The sum is :" +(a+b)));
        methodRefObject.getSum(20,40);

        MethodRefObject methodRefObject1 = addition::sum;
        methodRefObject1.getSum(10,20);


    }
}
