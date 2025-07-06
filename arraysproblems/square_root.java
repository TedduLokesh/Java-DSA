package arraysproblems;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;
import java.math.*;
public class square_root {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = input.nextInt();
        System.out.println(Math.sqrt(num));
    }
}
