//this program checks whether a matrix is magic sqaure or not, i.e, whether it has all the sum equivalent or not
import java.util.Scanner;
class magicsquare{
    void main(){
        Scanner sc = new Scanner(System.in);
        int i, j, k=1, v=4;
        int x[][] = new int[5][5];
        int y[][] = new int[5][5];
        //taking input
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                x[i][j] = k;
                k++;
            }
        }
        //printing the original matrix
        System.out.println();
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        //tranforming the daigonals
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                if(i==j){
                    y[v][v] = x[i][j];
                    v--;
                }
                else if((i+j)==4){
                    y[j][i] = x[i][j];
                }
                else{
                    y[i][j] = x[i][j];
                }
            }
        }
        //printing the new matrix
        System.out.println();
        for(i=0; i<5; i++){
            for(j=0; j<5; j++){
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
