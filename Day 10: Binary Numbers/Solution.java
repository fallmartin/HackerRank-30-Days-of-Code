import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        // Declare and initialize a binary string
        String binaryString = "";
        
        // Without using the toBinaryString method of the Integer class
        while (n != 0) {
            binaryString = (n % 2) + binaryString;
            n /= 2;
        }
        
        // Split the string to an array of 1s
        String[] array = binaryString.split("0");
        // Declare and initialize a counter
        int counter = 0;
        
        // Loop through the arrays and update counter to the longest one
        for (String str : array) {
            if (str.length() > counter) {
                counter = str.length();
            }
        }
        
        System.out.println(counter);

        scanner.close();
    }
}
