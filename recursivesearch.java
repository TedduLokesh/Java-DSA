public class recursivesearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int get = 5;
        int start = 0;
        int end = arr.length-1;
//        res?System.out.println("The target element index value is " + res):System.out.println("there is no element!!");;
        System.out.println(search(arr,get,start,end));

    }

    static int search(int[] nums,int target,int start,int end){

        int mid_Index = start + (end - start)/2;
        if(end < start){
            return -1;
        }
        if(nums[mid_Index] == target){
            return mid_Index;
        }
        if (target < nums[mid_Index]) {
            return search(nums,target,start,mid_Index-1);
        }
        return search(nums,target,mid_Index + 1,end);
    }
}
