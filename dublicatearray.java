public class dublicatearray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int res = secondLargest(nums);
        System.out.print(res + " ");
        int res2 = secondsmallest(nums);
        System.out.print(res2 + " ");
    }

    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int n = arr.length;
        if (n < 2) {
            System.out.println("There is no second largest element in the array: ");
        }
        for (int i = 0; i < n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        for (int j = 0; j < n - 2; j++) {
            second_largest = Math.max(second_largest, arr[j]);
        }
        if (second_largest == 0) {
            return 0;
        } else {
            return second_largest;
        }
    }

    static int secondsmallest(int[] arr) {
        int smaller_value = Integer.MAX_VALUE;
        int second_smaller = Integer.MAX_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            smaller_value = Math.min(smaller_value, arr[i]);
        }
        for (int j = n - 1; j > 1; j--) {
            second_smaller = Math.min(second_smaller, arr[j]);
        }
        if(second_smaller == 0){
            return 0;
        }else {
            return second_smaller;
        }
    }
}
