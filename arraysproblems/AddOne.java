package arraysproblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        ArrayList<Integer> nums  = new ArrayList<>();
        while (n > 0){
            int count = n % 10;
            nums.add(count);
            n /= 10;
        }

        int[] ans = new int[3];
        for (int index=0;index<nums.size();index++){
            ans[index] = nums.get(index);
        }
//        System.out.println("The given number in an array format is : " + Arrays.toString(ans));

    }
}
