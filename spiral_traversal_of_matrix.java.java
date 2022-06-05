/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
static void printSpiral(int mat[][], int R, int C){
    int top=0,right=C-1,bottom=R-1,left=0;
    while(top<=bottom && left<=right){
        //print the top row from left to right
        for(int i=left;i<=right;i++){
            System.out.println(mat[top][i]+"");
            top++;
        }
        //print right column from top to bottom
        for(int i=top;i<=bottom;i++){
            System.out.println(mat[i][right]+"");
            right--;
        }
        //print bottom row from right to left
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            System.out.println(mat[bottom][i]+"");
            bottom--;
            }
        }
        //print left column from bottom to top
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                System.out.println(mat[i][left]+"");
                left++;
            }
        }
    }
}
public static void main(String args[]){
    int mat[][]={{1,2,3,4},{6,7,8,9},{11,12,13,14},{16,17,18,19}};
    printSpiral(mat,4,4);
}
}