import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr = {5,2,4,3,1,8,7,6,10,9};
        Cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void Cyclicsort(int[] nums)
    {
        int i=0;
        while (i < nums.length)
        {
            int correctValue = nums[i] - 1;
            if(nums[i]!=nums[correctValue])
            {
                swap(nums,i,correctValue);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[] nums,int start,int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
