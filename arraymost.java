import java.util.Arrays;
import java.util.Scanner;

public class arraymost {
    public static void main(String[] args) {
//        String name = System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = function(arr);
        System.out.println(Arrays.toString(res));

    }
    static int[] function(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return new int[]{i,i+1};
            }
        }
        return new int[]{-1,-1};
    }
}
