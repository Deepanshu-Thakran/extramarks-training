import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try {
            int x = Integer.parseInt(sc.nextLine());
            int y = Integer.parseInt(sc.nextLine());
            System.out.println(x/y);
        } catch (NumberFormatException e){
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}