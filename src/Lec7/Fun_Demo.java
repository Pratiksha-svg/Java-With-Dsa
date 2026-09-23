package Lec7;

public class Fun_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a=9;
		int b=7;
		int c=a+b;
		Add();//calling
		System.out.println(c);
	}
	
	public static void Add() {
		int a=11;
		int b=17;
		int c=a+b;
		sub();
		System.out.println(c);
}
	public static void sub() {
		int a=11;
		int b=17;
		int c=a-b;
		System.out.println(c);
	}
	
}