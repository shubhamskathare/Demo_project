package com.test.welcometoorchard;

import java.util.Random;

public class Method_2D_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] my2DArray=new int[2][3];
		fill2DArray(my2DArray);
		print2Darray(my2DArray);
		System.out.println();
		twice(my2DArray);
		print2Darray(my2DArray);
		

	}
	public static void fill2DArray(int[][] twoDarr) {
		Random ran=new Random();
		for(int i=0;i<twoDarr.length;i++) {
			for(int j=0;j<twoDarr.length;j++) {
				twoDarr[i][j]=ran.nextInt(100);
			}
		}
	}
	public static void print2Darray(int[][] twoDarr) {
		for(int[] arr : twoDarr) {
			for(int num : arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
	public static void twice(int[][] twoDarr) {
		for(int i=0;i<twoDarr.length;i++) {
			for(int j=0;j<twoDarr.length;j++) {
				twoDarr[i][j]*=2;
			}
		}
	}

}
