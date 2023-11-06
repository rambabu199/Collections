import java.util.*;

public class Palin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        
        if (canFormPalindrome(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static boolean canFormPalindrome(String str) {
        int[] charCount = new int[26]; // Assuming only lowercase alphabets
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c - 'a']++;
        }
      System.out.println("frequency of each word");
      for(int i=0;i<charCount.length;i++)
        System.out.println(charCount[i]);
        
        int oddCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] % 2 != 0) {
                oddCount++;
            }
        }
        
        // A palindrome can have at most one character with an odd count
        return oddCount <= 1;
    }
}
