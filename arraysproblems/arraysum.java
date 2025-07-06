package arraysproblems;

import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("enter the elements of the array: ");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("sum of the array values: " + summarray(nums));
    }

    static int summarray(int[] nums){
        int sumOfArray = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOfArray +=nums[i];
        }
        return sumOfArray;
    }
}
