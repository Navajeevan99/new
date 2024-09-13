package String_pack;

import java.io.*;
import java.util.*;
import java.lang.String;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in); 
        String str=sc.nextLine();
        String str1="";
        for (int i=str.length()-1;i>=0;i--)
        {
         str1=str1+str.charAt[i];   
|       }
        if (str1==str)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    
        
    }
}