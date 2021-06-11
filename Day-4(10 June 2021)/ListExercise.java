import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    // void insert(List<Integer> l, int index, int value){

    // }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        for ( int i = 0; i<n ; i++ ){
            int l = sc.nextInt();
            list.add(l);
        }
        int q = sc.nextInt();
        for ( int i = 0; i<q ; i++ ){
            String choice = sc.next();
            switch (choice) {
                case "Insert":
                    int ind = sc.nextInt();
                    int val = sc.nextInt();
                    list.add(ind,val);
                    break;
                case "Delete":
                    int index = sc.nextInt();
                    list.remove(index);
                    break;
                default:
                    break;
            }
        }
        for ( int item : list ){
            System.out.print(item + " ");
        }
    }
}