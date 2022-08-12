package com.test.welcometoorchard;

public class Challenge_squre_doble {
	

	public static void main(String[] args) {
		printhello();
		printno(10);
		int res=getmy10();
		System.out.println(res);
		res=addthese(3, 5);
		System.out.println(res);
		res=square(5);
		System.out.println(res);
	}
		// TODO Auto-generated method stub
		public static void printhello() {
			System.out.println("Hello there");
		}
		public static void printno(int a) {
			System.out.println("Enter the no");
		}
		public static int getmy10() {
			return 10;
		}
		public static int addthese(int n1,int n2) {
			return n1+n2;
		}
		public static int square(int i) {
			return i*i;
		}

	

}
