package arraysproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class findingAlltitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter elements: ");
        for (int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int altitude = 0;
        int result = 0;
        for (int alttude_value:nums){
            altitude+=alttude_value;
            result = Math.max(result,altitude);
        }
        System.out.println("The maximum altitude value is" + " : " + result);
    }
}
