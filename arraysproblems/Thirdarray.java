package arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Thirdarray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}; // 0,4,1,3,2;
        int[] index = {0,1,2,2,1};
        ArrayList<Integer> ans = new ArrayList<>();
        int k=0;
        for (int i=0;i<index.length;i++){
            ans.add(index[i],nums[i]);
        }
        int[] arr = new int[nums.length];
        for (int i=0;i<ans.size();i++){
            arr[i] = ans.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
