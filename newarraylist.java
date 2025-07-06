import java.util.ArrayList;
import java.util.Collections;

public class newarraylist {
    public static void main(String[] args) {
        int[] nums = {5,3,5,2,46};
        ArrayList<Integer> new_list = new ArrayList<>(nums.length);
        for(int i = 0;i<nums.length;i++){
            new_list.add(nums[i]);
        }
        System.out.println(new_list + " ");
        Collections.sort(new_list);
        System.out.println("The list sort values are is " + new_list);
    }
}
