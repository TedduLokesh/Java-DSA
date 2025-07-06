import java.security.Key;
import java.util.HashMap;
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int size = sc.nextInt();
        System.out.println("enter the elements of the array: ");
        String[] arr = new String[size];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextLine();
        }
        System.out.println(max_length_of_string(arr));
    }
    static int max_length_of_string(String[] nums){
        int[] arr = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int count = 0;
            count +=string_length(nums[i]);
            arr[i] = count;
        }
        return largest_length(arr);
    }

    static int string_length(String num){
        return num.length();
    }


    static int largest_length(int[] arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
