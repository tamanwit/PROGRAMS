//this code gives all the magic + palidrome numbers persent within a range and also shows the immmediate previous magic number and the immediate next magic number
import java.util.Scanner;
public class MagicPalin {
    public static void main(String[] args) {
      //Scanner class object declaration
        Scanner sc = new Scanner(System.in);
      //declaring all the required variables
        int i, n, m, s=0, d, r;
      //taking input from the user
        System.out.println("Enter value to check greater than 1000 : ");
        n = sc.nextInt();
        m=n;
        d=(int)Math.pow(m, 5);
        //checking next magic number
        if(n>1000){
            for(i=(m+1); i<=d; i++){
                if((i-1)%9==0){
                    r=i;
                    while (r>0) {
                        s=s*10+(r%10);
                        r/=10;
                    }
                    if(s==i){
                        System.out.println("Next Immediate magic number :" + i);
                        break;
                    }
                    else{
                        s=0;
                    }
                }
            }
            for(i=(m-1); i>=1; i--){
                if((i-1)%9==0){
                    r=i;
                    while (r>0) {
                        s=s*10+(r%10);
                        r/=10;
                    }
                    if(s==i){
                        System.out.println("Immediate previous magic number :" + i);
                        break;
                    }
                    else{
                        s=0;
                    }
                }
            }
        }
    }
}
