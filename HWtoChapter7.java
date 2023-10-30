package edu.neu.mgen;

public class HWtoChapter7 {
    public static void main(String[] args) {
 
        
        int[][] A = {
            {2, 3, 4},
            {3, 4, 5}
        };
        int[][] B = {
            {1, 2},
            {3, 4}, 
            {5, 6}
        };

        if (A[0].length == B.length) {
            int rowA = A.length;
            int columnA = A[0].length;
            int rowB = B.length;
            int columnB = B[0].length;
            int[][] result = new int[rowA][columnB];//int[2][2]

            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    for (int k = 0; k < columnA; k++) {
                        result[i][j] = A[i][k] * B[k][j] + result[i][j];
                    }
                }
            }
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print(result[i][j] + " ");
                }
             System.out.println();
            }
        } else {
            System.out.println("No result!");
        }
    }
}
