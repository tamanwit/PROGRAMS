//this program rotates a 2D array in 180 degerees
import java.util.Scanner;
class rotation_180{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, j, n=3, k;
        int x[][] = new int[n][n];
        int y[][] = new int[n][n];
        //taking input from the user
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.println("Enter values : ");
                x[i][j] = sc.nextInt();
            }
        }
        //original matrix printing
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(x[i][j] + "\t");
            }
            System.out.println();
        }
        //rotation by 180 degrees
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(i==0)
                        x[i][j] = y[n-1][k];
                    
                }
                else if(i==1){
                    for(k=(n-1); k>=0; k--){
                        x[i][j] = y[n-2][k];
                    }
                }
                else if(i==(n-1)){
                    for(k=(n-1); k>=0; k--){
                        x[i][j] = y[n-3][k];
                    }
                }
            }
        }
        //new matrix printing
        System.out.println();
        System.out.println();
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(y[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
