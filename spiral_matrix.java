//prints a 2D array in spira order of traversal
import java.util.Scanner;
public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the size of the array  :");
        int n= sc.nextInt();
        int x[][] = new int[n][n];  //original array
        int y[][] = new int[n][n];    //modified matrix
        //taking input
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print("Enter values : ");
                x[i][j] = sc.nextInt();
            }
        }
        //printing the original matrix
        System.out.println();
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        //counting the number of daigonal elements
        int c=0;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i==j || (i+j)==(n-1)){
                    c++;
                }
            }
        }
        //logical part
        int a=0, b=0, d=0;
        int ld[] = new int[n];  //second row original matrix
        int rd[] = new int[n];  //second coloumn original matrix
        int ot[] = new int[(n*n)-c];   //for other elements
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i==(n/2)){
                    ld[a] = x[i][j];
                    a++;
                }
                if(j==(n/2)){
                    rd[b] = x[i][j];
                    b++;
                }
                if(i!=(n/2) && j!=(n/2)){
                    ot[d] = x[i][j];
                    d++; 
                }
            }
        }
        //filling of values of ld and rd and ot into new array
        a=0; b=0; d=0;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i==j){
                    y[i][j] = ld[a++];
                }
                if((i+j)==(n-1)){
                    y[i][j] = rd[b++];
                }
                if((i+j)==1 || (i+j)==n){
                    y[i][j] = ot[d++];
                }
            }
        }
        //printing the modified array
        System.out.println();
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
