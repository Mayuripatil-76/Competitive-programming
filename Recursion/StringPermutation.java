package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {

//        printPermutationsOfString("" , "abcd");

        System.out.println(printPermutationsOfString1("" , "abcd") );
    }

    public static void printPermutationsOfString(String p , String up ){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0) ;

        for(int i = 0 ; i<=p.length() ; i++ ){
            String s = p.substring(0 , i ) ;
            String e = p.substring(i , p.length()) ;

            printPermutationsOfString(s+ch+e , up.substring(1));
        }
    }

    public static List<String> printPermutationsOfString1(String p , String up ){
        if(up.isEmpty()){
            ArrayList<String> s = new ArrayList<>() ;
            s.add(p) ;
            return s ;
        }

        char ch = up.charAt(0) ;
        ArrayList<String> sa = new ArrayList<>() ;
        for(int i = 0 ; i<=p.length() ; i++ ){
            String s = p.substring(0 , i ) ;
            String e = p.substring(i , p.length()) ;

            sa.addAll(printPermutationsOfString1(s+ch+e , up.substring(1)));
        }

        return sa ;
    }
}
