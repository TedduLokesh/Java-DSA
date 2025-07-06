package arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class reshapematrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4},
        };
        int[][] nums = new int[1][4];
        int r = 1;
        int c = 4;
        int row = arr.length;
        int col = arr[0].length;
        int res_row = 0;
        int res_col = 0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                nums[res_row][res_col] = arr[i][j];
                res_col++;
                if (res_col == c){
                    res_col = 0;
                    res_row++;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                ans.add(nums[i][j]);
            }
        }
        System.out.println(ans);

    }
}
