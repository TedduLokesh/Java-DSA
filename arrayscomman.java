import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class arrayscomman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        squareofArray(arr);
    }

    static void squareofArray(int[] nums){
        for (int i=0;i<nums.length;i++){
            System.out.println("The array with square is" +  " : " + nums[i] * nums[i]);
        }
    }
}
