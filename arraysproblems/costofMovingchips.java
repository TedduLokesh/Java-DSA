package arraysproblems;

import java.util.Scanner;

public class costofMovingchips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter the elements: ");
        for (int i=0;i<nums.length;i++){
            nums[i]  = sc.nextInt();
        }
        System.out.println(minimum_cost_of_chips(nums));
    }

    static int minimum_cost_of_chips(int[] nums){
        int cost = 0;
        for (int num:nums){
            if (num % 2 == 0){
                cost++;
            }
        }
        return Math.min(cost,nums.length-cost);
    }
}
