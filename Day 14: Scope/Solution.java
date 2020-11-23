
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {

    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference() {
        if (elements.length <= 1) {
            return 0;
        } else {
            maximumDifference = Math.abs(elements[0] - elements[1]);

            for (int num1 : elements) {
                for (int num2 : elements) {
                    if (Math.abs(num1 - num2) > maximumDifference) {
                        maximumDifference = Math.abs(num1 - num2);
                    }
                }
            }

            return maximumDifference;
        }
    }

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
