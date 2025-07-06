package arraysproblems;

public class LastIndexofArray {
    public static void main(String[] args) {
        int[] nums = {3,5,7,4,2,5};
        int targetNumber = 5;
        int index = 0;
        System.out.println(firstandlastindex(nums,targetNumber,index));

    }

    static int firstandlastindex(int[] nums,int targetNumber,int index){
        if (index == nums.length-1){
            return index;
        }
        return firstandlastindex(nums,targetNumber,++index);
    }
}
