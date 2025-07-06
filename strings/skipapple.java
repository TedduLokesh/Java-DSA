package strings;

public class skipapple {
    public static void main(String[] args) {
        String str = "baccappesuitappes";
        System.out.println(skippingapp(str));
    }

    static String skipapple(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("apple")){
            return skipapple(str.substring(5));
        }else{
            return str.charAt(0) + skipapple(str.substring(1));
        }
    }
    static String skippingapp(String str){
        if (str.isEmpty()){
            return "";
        }
        if (str.startsWith("app") && !str.startsWith("apple")){
            return skippingapp(str.substring(3));
        }else{
            return str.charAt(0) + skippingapp(str.substring(1));
        }
    }
}
