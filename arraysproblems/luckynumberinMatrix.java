package arraysproblems;

import java.util.ArrayList;

public class luckynumberinMatrix {
    public static void main(String[] args) {
       int[][] matrix = {
               {3,7,8},
               {9,11,13},
               {15,16,17},
       };

       int[] minar = new int[matrix.length];
       for (int row = 0;row < matrix.length;row++){
           int min_number = matrix[row][0];
           for (int col = 0;col < matrix.length;col++) {
               if (matrix[row][col] < min_number) {
                   min_number = matrix[row][col];
               }
           }
           minar[row] = min_number;
       }

        int[] maxar = new int[matrix.length];
        for (int col = 0;col < matrix.length;col++){
            int max_number = matrix[0][col];
            for (int row = 0;row < matrix.length;row++) {
                if (matrix[row][col] > max_number) {
                    max_number = matrix[row][col];
                }
            }
            maxar[col] = max_number;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int row=0; row < matrix.length; row++){
            for(int col=0; col < matrix.length; col++){
                if(minar[row] == maxar[col]){
                    result.add(minar[row]);
                    break;
                }
            }
        }
        System.out.println("The no of lucky numbers in the given matrix is : " + " : " + result);
    }
}
