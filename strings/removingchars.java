package strings;

public class removingchars {
    public static void main(String[] args){
//        String name = "baccadh";
//        StringBuilder res = new StringBuilder();
////        char ch = name.charAt(i);
//        for (int i=0;i<name.length();i++){
//            char ch = name.charAt(i);
//            if (ch == 'a' || ch == 'b'){
//                continue;
//            }
//            res = res.append(ch);
//        }
//        System.out.println(res.reverse());
//        System.out.println(res.substring(1));
        String name = "baccadh";
        System.out.println("first method!!");
        skippingChar("",name);
//        System.out.println(name.toString())
        System.out.println("Second method!!");
        System.out.println(skippingChar(name));

    }

    static void skippingChar(String count,String name){
        if (name.isEmpty()){
            System.out.println(count);
            return;
        }
        char ch = name.charAt(0);
        if (ch == 'a'){
            skippingChar(count,name.substring(1));
        }else {
            skippingChar(count+ch,name.substring(1));
        }
    }

    static String skippingChar(String name){
        if (name.length() == 0){;
            return "";
        }
        char ch = name.charAt(0);
        if (ch == 'a'){
            return skippingChar(name.substring(1));
        }else {
            return ch + skippingChar(name.substring(1));
        }
    }
}
