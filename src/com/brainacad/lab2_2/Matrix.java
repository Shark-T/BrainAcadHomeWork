package com.brainacad.lab2_2;


/**
 * Created by SHARK on 14.01.2017.
 */
public class Matrix {
   /* class MainMatrix {*/ // вот в этой строчке была проблема. 4 часа разбирался
        public void sumMatrix(int matrixOne[][], int matrixTwo[][]) {
            int[][] resultMatrix = new int[matrixOne.length][matrixOne[0].length];
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[0].length; j++) {
                    resultMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
                }

            }
            System.out.println("Sum of matrix: ");
            printArray(resultMatrix);

        }

        void printArray(int[][] array) {
            for (int[] a : array) {
                for (int i : a) {
                    System.out.printf("%3d", i);
                }
                System.out.println("");
            }
        }


        public static void main(String[] arg) {
            int[][] matrixOne = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            int[][] matrixTwo = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

            Matrix matrix = new Matrix();
            matrix.sumMatrix(matrixOne, matrixTwo);

        }
    }

