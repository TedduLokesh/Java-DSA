package arraysproblems;

import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows: ");
        int r = sc.nextInt();
        System.out.println("cols: ");
        int c = sc.nextInt();
        int[][] nums = new int[r][c];
        System.out.println("Enter the elements: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(nums.length);
//        System.out.println(Diagonal_sum(nums,r,c));
    }

//    static int Diagonal_sum(int[][] nums,int r,int c){
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int row = 0;row < nums.length;row++){
//            for (int col = 0;col < nums.length;col++){
//                if (row == col){
//                    sum1 +=nums[row][col];
//                }
//            }
//        }
//        for (int row = 0;row < nums.length;row++){
//            for (int col = nums[row].length-1;col < nums.length;col--){
//                if ((row + col) == 2 && nums[row]!=nums[col]){
//                    sum2 +=nums[row][col];
//                }
//            }
//        }
//        return sum1 + sum2;
//    }
}
