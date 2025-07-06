import java.util.Arrays;

public class nameclass {
    public static void main(String[] args) {
        int[] arr = {56,34,23,5,2,7,1};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }

    static int[] bubblesort(int[] nums){
        int temp = 0;
        for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[i]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
//        int target = 12;
//        int count = 0;
//        for (int i=0;i<nums.length;i++){
//            if(nums[i] == target){
//                count++;
//            }
//        }
        return nums;
    }
}
