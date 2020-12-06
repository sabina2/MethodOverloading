package com.Loading;

public class Main {
        public static void add(){
            int sum=3+4;
            System.out.println(sum);
        }
            public static void add(int x,int y){
            int sum=x+y;
                System.out.println(sum);
            }

            public static void add(float a,float b){
            float sum=a+b;
                System.out.println(sum);
            }
    public static void main(String[] args) {
	Main m1=new Main();
	m1.add();
	m1.add(2,3);
	m1.add(2.2F,3.4F);
    }
}
