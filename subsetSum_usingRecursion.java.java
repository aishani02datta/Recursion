/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Main{
    static int subsetSum(int arr[], int n, int sum){
        if(n==0)
        return(sum==0)? 1 : 0;
        
        return subsetSum(arr,n-1,sum)+subsetSum(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String args[]){
        int arr[]={10,20,15}, n=3, sum=25;
        System.out.println(subsetSum(arr,n,sum));
    }
}