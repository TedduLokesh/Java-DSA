import java.util.Arrays;
import java.util.Scanner;

public class quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = sc.nextInt();
        System.out.println("enter the elements: ");
        int[] nums = new int[size];
        for (int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }

        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    static void quicksort(int[] nums,int low,int high){

        if (low >=high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot = nums[mid];

        while (nums[start] < pivot) {
            start++;
        }
        while (nums[end] > pivot){
            end--;
        }
        //upto now finding the pivot element from the array at it's original position //
        if (start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        quicksort(nums,low,end);
        quicksort(nums,start,high);

    }
}
