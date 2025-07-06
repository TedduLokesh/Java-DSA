package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class arrsubiterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element of the array: ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = arrayiterativesol(arr);
        System.out.println(ans.get(ans.size()-1).size());

        //[-2,1,-3,4,-1,2,1,-5,4]
//        System.out.println(ans);
//        System.out.println(ans);
//        int max = 0;
//        for (int i=0;i<ans.size();i++){
//            int n=ans.get(i).size();
//            if (max<n){
//                max = n;
//            }
//        }
//        System.out.println("The maximum "+ " : " + max);
//        System.out.println(arraydublicate(arr));
//        System.out.println('\n');
//        System.out.println("The subsetValues of the array are:");
//        System.out.println(ans);
//        for (List<Integer> value :ans){
//            System.out.println(value);
//        }
    }


    static List<List<Integer>> arrayiterativesol(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int num:nums){
            int n=list.size();
            for (int i=0;i<n;i++){
                List<Integer> ans = new ArrayList<>(list.get(i));
                ans.add(num);
                list.add(ans);
            }
        }
        return list;
    }

    static List<List<Integer>> arraydublicate(int[] nums){
        Arrays.sort(nums);
        int start = 0;
        int end = 0;
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i=0;i<nums.length;i++){
            start = 0;
            if (i>0 && nums[i] == nums[i-1]){
                start = end + 1;
            }
            end = list.size()-1;
            int n=list.size();
            for (int j=start;j<n;j++){
                List<Integer> ans = new ArrayList<>(list.get(j));
                ans.add(nums[i]);
                list.add(ans);
            }
        }
        return list;
    }
}
