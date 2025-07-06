import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class flashback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<String> new_list = new ArrayList<>(size);
        for(int i=0;i<size;i++){
            new_list.add(sc.next());
        }
        Collections.sort(new_list);
        System.out.println("The list of strings are: ");
        for (int i=0;i<new_list.size();i++){
            System.out.println(new_list.get(i));
        }
        System.out.println("The reversed strings are ");
        for (int i=new_list.size()-1;i>=0;i--){
            System.out.println(new_list.get(i));
        }
    }
}
