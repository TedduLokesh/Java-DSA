public class replacestringvalue {
    public static void main(String[] args) {
        String str = "1.1.1.1";
//        StringBuilder name = new StringBuilder();
//        for (int i=0;i<str.length();i++){
//            if(str.charAt(i) == '.'){
//                name.replace(i,".","[.]");
//            }
//        }
//        char ch = 'a';
//        System.out.println(str.toString());
//        for (int i=0;i<str.length();i++){
//            if (str.charAt(i) == '.'){
//                str.replaceAll(".","[.]");
//            }
//        }
//        System.out.println(str.toString());
//        StringBuilder new_string = new StringBuilder();

//        StringBuilder name = new StringBuilder();
//        for (char c : address.toCharArray()){
//            str.append((c == '.')? "[.]" : c );
//        }
//        System.out.println(str.toString());

//        StringBuilder name = new StringBuilder();
//        for (char c:str.toCharArray()){
//            name.append((c == '.')?"[.]":c);
//        }
//        System.out.println(name.toString());
        byte[] arr = {10,20,30,40};
        char ch = 'a';
        for (int i=0;i<arr.length;i++){
            ch+=i;
            System.out.print(ch + " ");
        }

    }
}
