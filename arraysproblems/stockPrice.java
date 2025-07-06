package arraysproblems;

public class stockPrice {
    public static void main(String[] args) {
        int []stockPrice = {7,1,5,3,6,4};
        //profit = selling price - buy price
        int profit = 0;
        int sellingPrice = 0;
        int buyPrice = 0;
        for (int i = 0; i < stockPrice.length; i++) {
            buyPrice = stockPrice[i];
            profit = sellingPrice;
        }
    }
}
