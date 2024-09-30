public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String parentheses) {
        int count = 0;
        int length = parentheses.length();
        for (int n = 0; n < length; n++) {
            char a = parentheses.charAt(n);
            if (a == '(') {
                count++;
            } else if (a == ')') {
                count--;
            }
        }
        return count == 0;
    }

    // 2. reverseInteger
    public static String reverseInteger(int number) {
        String a = "" + number;
        String result = "";
        for (int length = a.length(); length > 0; length--) {
            result = result + a.charAt(length - 1);
        }
        return result;
    }

    // 3. encryptThis
    public static String encryptThis(String message) {
        String result = "";
        String[] a = message.split(" ");
        for (int n = 0; n < a.length; n++) {
            char newSecond = a[n].charAt(a[n].length() - 1);
            char newLast = a[n].charAt(1);
            int newFirst = a[n].charAt(0);
            if (a[n].length() > 2) {
                a[n] = newFirst + String.valueOf(newSecond) + a[n].substring(2, a[n].length() - 1) + newLast;
                result = result + " " + a[n];
            } else if (a[n].length() <= 2) {
                a[n] = newFirst + String.valueOf(newSecond);
                result = result + " " + a[n];
            }
        }
        return result.trim();
    }

    // 4. decipherThis
    public static String decipherThis(String message) {
        String result = "";
        String[] a = message.split(" ");
        for (int n = 0; n < a.length; n++) {
            int newMessage = Integer.parseInt(a[n]);
            String newMessage1 = newMessage + "";
            int frontNum = 0;
            String backString = "";
            for (int m = 0; m < a[n].length(); m++){
                if(newMessage1(m,))
            }
        }
    }
}
