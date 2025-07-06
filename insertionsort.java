import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("enter the elements of the arrays: ");
        for (int i=0;i<size;i++)
        {
            nums[i] = sc.nextInt();
        }
        insertionsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionsort(int[] nums)
    {
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j>0;j--)
            {
                if(nums[j] < nums[j-1])
                {
                    swapping(nums,j,j-1);
                }
            }
        }
    }

    static void swapping(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
