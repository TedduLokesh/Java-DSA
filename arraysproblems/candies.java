package arraysproblems;

import java.util.ArrayList;

public class candies {
    public static void main(String[] args) {
        int[] arr = {2,8,7};
        int extra = 1;
        int addcandies = 0;
        ArrayList<Boolean> ans = new ArrayList<>();
////        int max = arr[0];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] > max){
//                max = arr[i];
//            }
//            while (i < arr.length){
//                addcandies = arr[i] + extra;
//                if (addcandies >= max){
//                    ans.add(true);
//                }else {
//                    ans.add(false);
//                }
//                break;
//            }
//        }
//        System.out.println(ans + " ");

        int i=0;
        int max = arr[0];
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        for (int j=0;j<arr.length;j++){
            addcandies = arr[j] + extra;
            if (addcandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        System.out.println(ans + " ");

    }
}
