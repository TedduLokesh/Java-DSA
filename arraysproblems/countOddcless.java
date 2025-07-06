package arraysproblems;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class countOddcless {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int r = sc.nextInt();
        System.out.println("enter cols: ");
        int c = sc.nextInt();
        int[][] nums = {
                {0,1},
                {1,1},
        };

        int[] arrRow = new int[r];
        int[] arrCol = new int[c];
        for (int i=0;i<nums.length;i++){
            int row = nums[i][0];
            int col = nums[i][1];

            arrRow[row]++;
            arrCol[col]++;
        }
        int oddCount = 0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (((arrRow[i] + arrCol[j])%2!=0)){
                    oddCount++;
                }
            }
        }
        System.out.println("The odd count value is " + " : " + oddCount);
    }
}
