import java.util.Scanner;

public class javasolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("elements: ");
        for (int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int result = subsum(nums);
        System.out.println("The total sum value is" + " : " + result + " ");
    }

    static int subsum(int[] arr){
        int start = 0;
        int end = arr.length;
        int mid = (start + end)/2;
        int sum1 = 0;
        for (int i=0;i<=mid;i++){
            sum1 +=arr[i];
        }
        int sum2 = 0;
        for (int i=mid+1;i<=end-1;i++){
            sum1 +=arr[i];
        }
        return sum1 + sum2;
    }
}
