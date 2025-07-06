package arraysproblems;

public class FirstIndexOfArray {
    public static void main(String[] args) {
        //to finding the first index value of from the array
        int[] arr = {3,5,7,4,2,5};
        int targetNumber = 5;
        int index =0;
        int result = findindex(arr,targetNumber,index);
        System.out.println("First Index: " + result);
    }

    static int findindex(int[] arr,int target,int index){
        if (index == arr.length){
            return 0;
        }
        if (arr[index] == target){
            return index;
        }else {
            return findindex(arr,target,++index);
        }
    }

}
