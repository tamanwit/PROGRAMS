//program to check smith number by accepting an integer from the user
import java.util.Scanner;
public class smith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, d, s=0, spf=0, c=0, m;
        System.out.println("Enter any number to check: ");
        int n=  sc.nextInt();
        m = n;
        while(m>0){
            s += (m%10);
            m/=10;
        }
        //checking prime factors
        for(i=2; i<n; i++){
            if(n%i==0){
                c=0;
                for(j=2; j<i; j++){
                    if(i%j==0){
                        c++;
                    }
                }
                d=i;
                if(c==0){
                    while(d>0){
                        spf += (d%10);
                        d/=10;
                    }
                }
            }
        }
        if(s==spf){
            System.out.println("Smith Number");
        }
        else{
            System.out.println("Not smith");
        }
    }
}
