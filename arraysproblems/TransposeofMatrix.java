package arraysproblems;

import java.util.Scanner;

public class TransposeofMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row: ");
        int row = sc.nextInt();
        System.out.println("enter the col: ");
        int col = sc.nextInt();
        System.out.println("enter elements: ");
        int[][] nums = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int[][] ans = new int[nums[0].length][nums.length];
        System.out.println("transpose matrix: ");
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                ans[i][j] = nums[j][i];
            }
        }
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
