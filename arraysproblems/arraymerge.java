package arraysproblems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arraymerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int[] nums = new int[2 * arr.length];
        int n = arr.length;
        for (int i=0;i<nums.length;i++){
            if (i < n){
                nums[i] = arr[i];
            }else{
                nums[i] = arr[i-n];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
