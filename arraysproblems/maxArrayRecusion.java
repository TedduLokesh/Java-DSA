package arraysproblems;

import java.util.Scanner;

public class maxArrayRecusion {
    public static void main(String[] args) {
//        int[] nums = {8,6,9,1,2};
//        int size = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements: ");
        for (int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
//        int index = 0;
        System.out.println(MaxElement(nums,0));
    }

    static int MaxElement(int[] nums,int index) {
        if (index == nums.length){
            return 0;
        }
        int max = MaxElement(nums,index+1);
        if (max < nums[index]){
            max = nums[index];
        }
        return max;

    }

}
