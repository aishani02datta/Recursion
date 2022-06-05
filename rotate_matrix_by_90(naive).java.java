/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// naive solution to rotate a matrix by 90 degrees counterclockwise
class Main{
    static int n=4;
    static void rotate90(int mat[][]){
        int temp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                temp[n-j-1][i]=mat[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=temp[i][j];
            }
        }
    }
    public static void main(String args[]){
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate90(mat);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(mat[i][j]+"");
            }
        }
        
    }
}