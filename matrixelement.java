import java.util.Arrays;
import java.util.Scanner;

public class matrixelement {
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {23,34,45,56},
                {35,47,58,63},
                {49,56,67,78},
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a target value is");
        int target = sc.nextInt();
        System.out.println("The result of target index is " + Arrays.toString(matrix_search(arr,target)));
    }

    static int[] matrix_search(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;
        while (row < matrix.length && col >=0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if (matrix[row][col] > target) {
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}