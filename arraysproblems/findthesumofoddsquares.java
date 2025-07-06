package arraysproblems;

import java.util.Scanner;

public class findthesumofoddsquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        System.out.println("enter elements: ");
        int[] nums = new int[size];
        for (int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(oddSum(nums));
    }

    static int oddSum(int[] nums){
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2!=0){
                sum += odd(nums[i]);
            }
        }
        return sum;
    }

    static int odd(int num){
        return num * num;
    }
}
