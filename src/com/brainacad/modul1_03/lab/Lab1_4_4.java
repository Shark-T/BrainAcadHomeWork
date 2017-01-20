package com.brainacad.modul1_03.lab;

public class Lab1_4_4 {
	public static void main(String [] arg){
		int a = 5;
		System.out.println(a++); // выведет 5 и потом увеличит на 1
		System.out.println(++a); // сначала увеличит на 1, потом выведет. 7
		System.out.println(--a); // сначала уменьшит на 1, потом выведет. 6
		System.out.println(a--); // сначала выведет 6, потом уменьшит на 1.
		System.out.println(a); // выведет 5
	}
}
