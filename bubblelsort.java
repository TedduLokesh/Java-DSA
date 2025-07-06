public class bubblelsort {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,6};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums){
        int i=0;
        while (i < nums.length){
            int correct_index = nums[i];
            if (nums[i]!=correct_index){
                swap(nums,i,correct_index);
            }else {
                i++;
            }
        }
        for (int index=0;index<nums.length;index++){
            if (nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums,int first ,int end){
        int temp = nums[first];
        nums[first] = nums[end];
        nums[end] = temp;
    }
}
