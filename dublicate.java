import java.util.ArrayList;
import java.util.Scanner;

public class dublicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("elements: ");
        int i;
        for (i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        boolean value = dublicate_elments(nums);
        System.out.println("The value is " + value);

        ArrayList<Integer> ans = new ArrayList<>();
        for (int j=0;j<5;j++)
        {
            ans.add(sc.nextInt());
        }
        for (int k=0;k<5;k++)
        {
            System.out.println(ans.get(k));
        }

    }

    static boolean dublicate_elments(int[] nums){
        int i;
        for (i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
