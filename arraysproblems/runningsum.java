package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class runningsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int count = 0;
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            count+=nums[i];
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans) + "");
    }
}
