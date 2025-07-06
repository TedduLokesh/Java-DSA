import java.util.Arrays;
import java.util.Scanner;

public class countarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("size");
        int size = in.nextInt();
        int[] arr = new int[size];
        int i;
        System.out.println("elements");
        for(i=0;i<size;i++){
            arr[i] = in.nextInt();
        }
        int index = 2;
        int insertElement = 100;
        int[] nums = new int[arr.length+1];
        int j;
        for(i=0,j=0; i<nums.length;i++){
            if(i==index){
                arr[i] = insertElement;
            }else{
                nums[i] = arr[j];
                j++;
            }
        }
        System.out.println("The final array elements are");
        for(i=0;i<nums.length;i++){
            System.out.println("index value is " + i + " : " + nums[i]);
        }
    }
}
