import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        int i;
        for(i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int count = binarysearch(arr,target);
        System.out.println(count + " ");
    }

    static int binarysearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }

        }
        return end;
    }
}
