package com.brainacad.modul1_05.lab;
import java.util.Scanner;
public class Lab1_5_2 {
	public static void main(String[] args) {
		System.out.println("Write number 1 - 10");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String num;
		switch (number){
			case 1:num = "One";
				break;
			case 2:num = "Two";
				break;
			case 3:num = "Three";
				break;
			case 4:num = "Four";
				break;
			case 5:num = "Five";
				break;
			case 6:num = "Six";
				break;
			case 7:num = "Seven";
				break;
			case 8:num = "Eight";
				break;
			case 9:num = "Nine";
				break;
			default:num = "Other";
				break;
		}
		System.out.println(num);
		scan.close();
	}
}
