package arraysproblems;

public class evenNumberdigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
//        System.out.println(evenDigits(nums));
//        int n = 1234;
        System.out.println(evenDigits(nums));
    }
    static int evenDigits(int[] nums) {
        int count = 0;
//        int i = 0;
        int digit = 0;
        for (int i=0;i<nums.length;i++){
            digit = (int)Math.log10(nums[i])+1;
            if (digit%2 == 0){
                count++;
            }
        }
        return count;
    }
}
