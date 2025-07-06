public class polindrome {
    public static void main(String[] args) {
        String ans = "retter";
        System.out.println(sum(ans));
    }

    static boolean sum(String ans){
        if(ans == null || ans.length() == 0){
            return false;
        }
        ans.toLowerCase();
       for (int i=0;i<=ans.length()/2;i++){
           char start = ans.charAt(i);
           char end = ans.charAt(ans.length()-1-i);
           if(start!=end){
               return false;
           }
       }
       return true;
    }
}
