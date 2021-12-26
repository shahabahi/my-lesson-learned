package com.api.assignment;

public class A {
        A other;

        public static void main(String[] args) {

                A a=new A();
                A b=new A();
                a.other=b;
                b.other=a;
                String z="new";
                System.out.println("new".equals(z));

        }
}
