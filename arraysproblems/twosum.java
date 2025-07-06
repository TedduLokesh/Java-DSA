package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target: ");
        int t = sc.nextInt();
        System.out.println(Arrays.toString(Twosum(arr,t)));
    }

    static int[] Twosum(int[] nums,int target){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
