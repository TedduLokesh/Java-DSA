import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class namegone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = sc.nextInt();
        System.out.println(function(num));
    }

    static int function(int num){
        if(num < 0){
            return -1;
        }
        if(num!=0 && num!=1) {
            return Math.abs(num * function(num - 1));
        }
        return 1;
    }
}
