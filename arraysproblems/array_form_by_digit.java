package arraysproblems;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class array_form_by_digit {
    public static void main(String[] args) {
//        int[] arr = {1,2,0,0};
//        int k = 34;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the kth number:  ");
        int k = sc.nextInt();

    }
    static List<Integer> array_form(int[] nums ,int k){

        List<Integer> ans = new ArrayList<>();
        for (int i= nums.length-1;i>=0;--i){
            ans.add(0,(nums[i] + k) % 10);
            k = (nums[i] + k) / 10;
        }
        while (k > 0){
            ans.add(0,(k % 10));
            k = k/10;
        }
        return ans;
    }
}
