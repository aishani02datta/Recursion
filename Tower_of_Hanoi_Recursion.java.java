/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Main{
static void TOH(int n, char A, char B, char C){
    if(n==1){
        System.out.println("Move disk 1 from" +A + "to" + C);
        return;
    }
        
    TOH(n-1,A,C,B);
    System.out.println("Move disk" + n + "from" + A + "to" + C);
    TOH(n-1,B,A,C);
    }
public static void main(String args[]){
    int n=8;
    TOH(n,'A','B','C');
}
}