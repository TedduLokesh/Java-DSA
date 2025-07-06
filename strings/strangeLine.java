package strings;

import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class strangeLine {
    public static void main(String[] args) {
        Stack<Integer> ans = new Stack<>();
        ans.push(20);
        ans.push(30);
        ans.push(40);
        ans.push(50);
        ans.push(60);
        ans.push(70);
        ans.push(80);
        int[] nums = new int[ans.size()];
        int index = 0;
        for (int i=ans.size()-1;i>=0;i--){
            nums[index++] = ans.pop();
        }
        System.out.println(element(nums));
    }

    static int element(int[] nums){
        int count = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
