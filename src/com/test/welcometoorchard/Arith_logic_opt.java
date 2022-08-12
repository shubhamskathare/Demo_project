package com.test.welcometoorchard;
import java.util.Scanner;
public class Arith_logic_opt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=s.nextInt();
	    int add=a+b+c+d;
		int sub=a-b-c-d;
		int mul=a*b*c*d;
		int div=a/b/c/d;
		System.out.println((a>b)&&(b>c)&&(c>d)&&(d>a));
		System.out.println((a<b)&&(b<c)&&(c<d)&&(d<a));
		System.out.println((a>b)||(b>c)||(c>d)||(d>a));
		System.out.println((a<b)||(b<c)||(c<d)||(d<a));
		System.out.println(!(a==b));
		System.out.println(!(c==d));
		System.out.println("Addition:"+add);
		System.out.println("Substraction:"+sub);
		System.out.println("multiplication:"+mul);
		System.out.println("Divison:"+div);
	}

}
