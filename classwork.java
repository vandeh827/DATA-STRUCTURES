package class4.subPro;

public class classwork {

    public static boolean isPalindrome(String word) {
        String newWord = word.toLowerCase().replaceAll("[^a-z]", "");
        int startIndex = 0;
        int endIndex = newWord.length() - 1;

        while (startIndex < endIndex) {
            if (newWord.charAt(startIndex) != newWord.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testWord1 = "civic";
        String testWord2 = "racecar";
        String testWord3 = "service";
        if (isPalindrome(testWord1)) {
            System.out.println(testWord1 + " is a palindrome");
        } else {
            System.out.println(testWord1 + " is not a palindrome");
        }
        if (isPalindrome(testWord2)) {
            System.out.println(testWord2 + " is a palindrome");
        } else {
            System.out.println(testWord2 + " is not a palindrome");
        }if (isPalindrome(testWord3)) {
            System.out.println(testWord3 + " is a palindrome");
        } else {
            System.out.println(testWord3 + " is not a palindrome");
        }
    }
}



