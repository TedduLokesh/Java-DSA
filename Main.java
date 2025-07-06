import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int size = in.nextInt();
        int[] arr = new int[size];
        int i;
        for(i=0;i<size;i++){
            System.out.println("enter elements");
            arr[i] = in.nextInt();
        }
        System.out.println("enter target");
        int target = in.nextInt();
        int result = search(arr,target);
        System.out.println(result + " ");
    }

    static int search(int[] nums,int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            int temp = start;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        int ans = binarysearch(nums,target,start,end);
        return ans;
    }

    static int binarysearch(int[] nums,int target,int start,int end){
        while(start > end){
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