import java.util.Scanner;
class matrix_multiply{
    void main(){
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        System.out.println("Enter size of matrix rows for 1st array : ");
        int m = sc.nextInt();
        System.out.println("Enter size of matrix col. for 1st arrray : ");
        int n = sc.nextInt();
        System.out.println("Enter size of matrix rows for 2nd array : ");
        int a = sc.nextInt();
        System.out.println("Enter size of matrix col. for 2nd array : ");
        int b = sc.nextInt();
        //array declaration
        int x[][] = new int[m][n];
        int y[][] = new int[a][b];
        int z[][] = new int[m][b];
        //taking input into the array
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                 System.out.println("Enter the values for matrix 1: "); 
                 x[i][j] = sc.nextInt();
            }
        }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                 System.out.println("Enter the values for matrix 2: "); 
                 y[i][j] = sc.nextInt();
            }
        }
        //matix multiplication
        if(n==a){
            for(i=0; i<m; i++){
                for(j=0; j<b; j++){
                    z[i][j] = 0;
                    for(k=0; k<m; k++){
                        z[i][j] += x[i][k] * y[k][j];
                    }
                    System.out.print(z[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
