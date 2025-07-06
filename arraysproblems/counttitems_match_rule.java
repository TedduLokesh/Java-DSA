package arraysproblems;

public class counttitems_match_rule {
    public static void main(String[] args) {
        String[][] items = {
                {"phone", "blue", "pixel"},
                {"computer", "silver", "phone"},
                {"phone", "gold", "iphone"}
        };
        String ruleKey = "type";
        String ruleValue = "phone";
        System.out.println(CountItems_value(items,ruleKey,ruleValue));

    }
    static int CountItems_value(String [][] items,String rulekey,String ruleValue){
        int count = 0;
        for (int i=0;i<items.length;i++){
            if (rulekey.equals("type") && items[i][0].equals(ruleValue)){
                count++;
            }
            if (rulekey.equals("color") && items[i][1].equals(ruleValue)){
                count++;
            }
            if (rulekey.equals("name") && items[i][2].equals(rulekey)){
                count++;
            }
        }
        return count;
    }

}
