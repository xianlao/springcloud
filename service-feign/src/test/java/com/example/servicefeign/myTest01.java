package com.example.servicefeign;

import java.util.Arrays;

/**
 * Created ${xian}
 */
public class myTest01 {

    public static void main(String[] args) {

        myTest01 tester = new myTest01();

        MathOperation addition = ( a,  b) -> a + b;
        MathOperation addition1 = ( a,  b) ->(double) b / a;
        //MathOperation addition2 = (int a, int b) -> a*2;
        MathOperation addition3 = ( a,  b) ->{return  b/a;};

       /* System.out.println((float) 2/3);
        System.out.println(tester.operate(2,3,addition));*/
        System.out.println(tester.operate(2,3,addition1));
       /* System.out.println(tester.operate(2,3,addition2));*/
        System.out.println(tester.operate(2,3,addition3));

    }

    interface MathOperation {
        double operation(int a, int b);
    }

    private double operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation( a, b);
    }

}



