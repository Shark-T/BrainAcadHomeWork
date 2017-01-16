package com.brainacad.modul1_05.lab;
import java.util.Scanner;
public class Lab1_5_2 {
	public static void main(String [] arg){
		System.out.println("Enter number 0 - 9");
		Scanner i = new Scanner(System.in);
		int a = i.nextInt();
		if (a == 0){
			System.out.println("Null");
		}
		else if(a == 1){
			System.out.println("One");
		}
		else if (a==2){
			System.out.println("Two");
		}
		else if(a == 1){
			System.out.println("One");
		}
		else if (a==2){
			System.out.println("Two");
		}
		else if(a == 3){
			System.out.println("three");
		}
		else if (a==4){
			System.out.println("four");
		}
		else if(a == 5){
			System.out.println("Five");
		}
		else if (a==6){
			System.out.println("six");
		}
		else if (a==7){
			System.out.println("seven");
		}
		else if (a==8){
			System.out.println("eight");
		}
		else if (a==9){
			System.out.println("nine");
		}
		else {
			System.out.println("other");
		}
		
			
		
		i.close();
	}
}
