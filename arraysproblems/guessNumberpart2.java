package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class guessNumberpart2 {
    public static void main(String[] args) {
        int length = 0;
        int n = 12;
        int k = 3;
        int index = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                length++;
            }
        }
        int[] nums = new int[length];
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                nums[index++] = i;
            }
        }
        System.out.println(length);
        System.out.println(Arrays.toString(nums));
        if (nums.length < k){
            System.out.println(-1);
        }else{
            System.out.println(nums[k-1]);
        }
    }
}
