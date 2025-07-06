package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        System.out.println("enter the elements of the array is");
        int[] nums = new int[num];
        int count = 1;
        for(int i=0;i<nums.length;i++){
            nums[i] = count + i;
        }
        System.out.println("The result array value is + " + ": " + Arrays.toString(nums));
        System.out.println("enter the pick value is:  ");
        int pick = sc.nextInt();
        int result_number = search(nums,pick);
        System.out.println("The pick number is " + result_number);
    }


    static int search(int[] nums,int pick){
        int start = 0;
        int end = nums.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] == pick){
                return mid;
            }
            if (pick < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
