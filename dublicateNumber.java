import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class dublicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3,3};
        int result = dublicate(arr);
        System.out.println(result);
    }

    static int dublicate(int[] nums)
    {
        int i=0;
        while (i < nums.length)
        {
            int correctIndex = nums[i]-1;
            if (nums[i]!=i+1)
            {
                int correctValue = nums[i] - 1;
                if(nums[i]!=nums[correctValue])
                {
                    swap(nums,i,correctIndex);
                }
                else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;

    }
    static void swap(int[] nums,int start,int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

}
