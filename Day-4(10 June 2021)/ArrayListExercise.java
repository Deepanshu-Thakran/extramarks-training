import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
        for( int i = 0; i<n ; i++ ){
            int d = sc.nextInt();
            ArrayList<Integer> secondaryList = new ArrayList<Integer>();
            for ( int j = 0; j<d ; j++){
                int ele = sc.nextInt();
                secondaryList.add(ele);
            }
            mainList.add(secondaryList);
        }
        
        int q = sc.nextInt();
        for (int i = 0; i<q ; i++){
            int y = sc.nextInt();
            int x = sc.nextInt();
                // System.out.println(mainList.get(y-1));
                ArrayList<Integer> temp = mainList.get(y-1);
                if ( temp.isEmpty() ){
                    System.out.println("ERROR!");
                } else if ( temp.size() < x ) {
                    System.out.println("ERROR!");
                } else {
                    System.out.println(temp.get(x-1));
                }
        }
    }
}
