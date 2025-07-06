public class arrayelements {
    public static void main(String[] args) {
        int[] nums = {1,2,4,7,7,5};
        int result1 = secondSmallest(nums);
        int result2 = secondLargest(nums);
        System.out.println("The element is " + result1);
        System.out.println("The element is " + result2);

    }

    static int secondSmallest(int[] nums)
    {
        int small_value = nums[0];
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i] < small_value)
            {
                small_value = nums[i];
            } else if (nums[i] < small_value && small_value!=small_value)
            {
                small_value = nums[i];
            }
        }
        return small_value;
    }

    static int secondLargest(int[] nums)
    {
        int second_largest = nums[0];
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i] > second_largest)
            {
                second_largest = nums[i];
            } else if (nums[i] > second_largest && second_largest!=second_largest)
            {
                second_largest = nums[i];
            }
        }
        return second_largest;
    }
}
