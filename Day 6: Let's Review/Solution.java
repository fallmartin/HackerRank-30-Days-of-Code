import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine(); // Clear the scanner from the new line character
        
        String[] arrayOfStrings = new String[T];
        
        for (int i = 0; i < T; i++) {
            arrayOfStrings[i] = scan.nextLine();
        }
        
        scan.close();
        
        for (String s : arrayOfStrings) {
            for (int i = 0; i < s.length(); i = i + 2) {
                System.out.print(s.charAt(i));
            }
            
            System.out.print(" ");
            
            for (int i = 1; i < s.length(); i = i + 2) {
                System.out.print(s.charAt(i));
            }
            
            System.out.println();
        }
    }
}
