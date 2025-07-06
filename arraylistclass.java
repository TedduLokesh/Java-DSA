import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class arraylistclass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.println("enter elements");
        for(i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        System.out.println("target");
        int target = in.nextInt();
        System.out.println(ans(arr,target));
    }

    static int ans(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(target > nums[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarysearch(nums,target,start,end);
    }

    static int binarysearch(int[] nums,int target,int start,int end){
        while(start <=end){
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
