import java.util.Scanner;
public class lucky_series {
    public static void islucky(int n){
        int i, j;
        int x[] = new int[n];
        //filling of the array
        for(i=0; i<n; i++){
            x[i] = i+1;
        }
        int del=1;
        System.out.println("LUCKY NUMBERS ARE :");
        while(del<n){
            for(i=del; i<n; i+=del){
                for(j=i; j<n-1; j++){
                    x[j] = x[j+1];
                }
                n--;
            }
            del++;
        }
        for(i=0; i<n; i++){
            System.out.print( + x[i] + "\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lucky_series obj = new lucky_series();
        System.out.println("Enter Range : ");
        int n = sc.nextInt();
        obj.islucky(n);
    }
}
