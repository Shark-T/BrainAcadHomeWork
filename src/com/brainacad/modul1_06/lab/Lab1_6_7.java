package com.brainacad.modul1_06.lab;
import java.util.Scanner;
public class Lab1_6_7 {
	public static void printArray (int[][]array){	
		for	(int [] a:array){
				for (int i:a){
					System.out.printf("%3d", i);
				}
				System.out.println(""); 		
			}
	}
	public static void main(String [] arg){
		int[][] array = { {5,1,1,3,4},{ 2,1,3,2,1},{ 2,2,3,4,1},{ 3,3,3,1,4}};
		printArray(array);
		System.out.println("Write number for search in string");
		Scanner sN = new Scanner(System.in);
		int b = sN.nextInt();	
		sN.close();
		int [][] equalsArray=new int[array.length][array[1].length];
		int count=0;	
		for (int i=0; i <array.length; i++){
				for(int j=0; j<array[i].length; j++)
				if (b == array[i][j]){
					equalsArray[i][j]=j;
					count++;
				} else {
					equalsArray[i][j]=-1;
				}
				}
			printArray(equalsArray);}}
	/*		
			}
		if (count > 1){
			for (int k = 0; k < equalsArray.length; k++ ){
			System.out.print("Line " + (k + 1) + ": [");
				count=0
				for (int j = 0; j < equalsArray[k].length; j++){
					if(equalsArray[k][j] != -1){
						count++;
						String comma
					}
				}
			}
			}
		
	
	
	}*/
	
	
