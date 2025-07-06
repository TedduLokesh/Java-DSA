package arraysproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class flipinganimagearrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of matrix: ");
        int size = sc.nextInt();
//        List<List> ans = new ArrayList<>(size);
        int[][] image = new int[size][size];
        for (int row =0;row <size;row++){
            for (int col=0;col<size;col++){
                image[row][col] = sc.nextInt();
            }
            System.out.println();
        }
//        for (int row =0;row <size;row++){
//            for (int col=0;col<size;col++){
////                image[row][col] = sc.nextInt();
//                System.out.print(image[row][col] + " ");
//            }
//            System.out.println();
//        }


        for (int[] arr :image){
            for (int row=0;row<arr.length;row++){
                int temp = arr[row];
                arr[row] = arr[arr.length-row-1];
                arr[arr.length-row-1] = temp;
            }
        }
        for (int row =0;row <image.length;row++){
            for (int col=0;col<image.length;col++){
//                image[row][col] = sc.nextInt();
                System.out.print(image[row][col] + " ");
            }
            System.out.println();
        }
    }
}
