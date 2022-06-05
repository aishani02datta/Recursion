/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// ROPE CUTTING PROBLEM
import java.util.*;
import java.io.*;
class Main{
    static int maxNumberOfPieces(int n, int a, int b, int c){
        if(n==0)
           return 0;
        if(n<0)
           return -1;
        int result=(Math.max(maxNumberOfPieces(n-a,a,b,c)),Math.max(maxNumberOfPieces(n-b,a,b,c)),Math.Max(maxNumberOfPieces(n-c,a,b,c)));
        if(result==-1)
           return -1;
        return result+1;
    }
    public static void main(String args[]){
        int n=23,a=11,b=9,c=12;
        System.out.println(maxNumberOfPieces(n,a,b,c));
    }
}