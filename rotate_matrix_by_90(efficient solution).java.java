/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// efficient solution to rotate a matrix by 90 degrees counterclockwise
class Main{

static void swap(int mat[][], int i, int j){
    int temp=mat[i][j];
    mat[i][j]=mat[j][i];
    mat[j][i]=temp;
}
static void swap2(int mat[][],int i,int low,int high){
    int temp=mat[low][i];
    mat[low][i]=mat[high][i];
    mat[high][i]=temp;
}
    static int n=4;
    static void rotate90(int mat[][]){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat,i,j);
            }
        }
    for(int i=0;i<n;i++){
        int low=0,high=n-1;
        while(low<high){
            swap2(mat,i,low,high);
            low++;
            high--;
        }
    }
    }
    public static void main(String args[]){
        int mat[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        rotate90(mat);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(mat[i][j]+" ");
            }
        }
    }
}