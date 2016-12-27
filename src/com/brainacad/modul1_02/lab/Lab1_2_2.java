package com.brainacad.modul1_02.lab;
import java.util.Scanner;
public class Lab1_2_2 {
	public static void main(String[] arg){
		System.out.println("Enter the name of the student");
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println("Student`s name is " +line);
		sc.close();
	}
} 