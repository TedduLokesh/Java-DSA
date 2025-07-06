package arraysproblems;

import java.util.Arrays;
import java.util.Scanner;

public class productofarrayexecptself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        int[] nums = new int[size]; // [-1,1,0,-3,3]//
        System.out.println("enter the elements of the array: ");
        for (int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(productArray(nums)));
    }
    static int[] productArray(int[] nums){
        int[] arr = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int count = 1;
            for (int j=1;j<nums.length;j++){
                if (j!=i){
                    count = count * nums[j];
                }
            }
            if (count > 0){
                arr[i] = count;
            }else {
                arr[i] = (-1) * count;
            }
        }
        return arr;
    }
}
