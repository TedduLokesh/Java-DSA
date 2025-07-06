import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        miss(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int miss(int[] arr)
    {
        int i=0;
        while (i<arr.length)
        {
            int corretIndexValue = arr[i] - 1;
            if(arr[i]!=arr[corretIndexValue])
            {
                swap(arr,i,corretIndexValue);
            }
            else
            {
                i++;
            }
        }

        // missing elements are//
        ArrayList<Integer> new_list = new ArrayList<>();
        for (int index = 0; index < new_list.size(); index++)
        {
            if(new_list.get(index)!=index+1)
            {
                new_list.add(index+1);
            }
        }
        for (int j=0;i<new_list.size();j++)
        {
            return new_list.get(j);
        }
        return -1;

    }

    static void swap(int[] nums,int first,int last)
    {
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
    }
}
