package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDublicatesfromarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //[0,0,1,1,1,2,2,3,3,4]
        System.out.println("enter size: ");
        int size = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] nums = new int[size];
        for (int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(removeDublicates(nums));
    }

    static int removeDublicates(int[] nums){
        int count = 1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}
