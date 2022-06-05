/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Main{
static int r=4,c=4;
static void printSnake(int matrix[][]){
    for(int i=0;i<r;i++){// to count the number of rows or size of the matrix
        if(i%2==0)
        for(int j=0;j<c;j++){// print the even rows by traversing from left to right
            System.out.println(matrix[i][j]+"");
        }
        else
        for(int j=c-1;j>=0;j--){
            System.out.println(matrix[i][j]+"");
        }
    }
}
public static void main(String args[]){
    int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    printSnake(matrix);
}
}
