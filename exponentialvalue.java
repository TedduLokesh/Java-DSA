public class exponentialvalue {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.print(a);
        printSuperscriptPower(b);
    }

    private static void printSuperscriptPower(int b) {
        String bStr = Integer.toString(b);
        for (char digit : bStr.toCharArray()) {
            if (Character.isDigit(digit)) {
                int superscriptDigit = Character.getNumericValue(digit) + 8272; // Unicode for superscript 0-9
                char superscriptChar = (char) superscriptDigit;
                System.out.print(superscriptChar);
            }
        }
        System.out.println();
    }
}
