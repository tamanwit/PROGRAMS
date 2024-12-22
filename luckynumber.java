import java.util.Scanner;
public class luckynumber {
    public static int c=2;
    public static boolean islucky(int n){
        if(c> n)
            return true;
        if(n%c == 0)
            return false;
        n = n-(n/c);
        c++;
        return islucky(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check : ");
        int n = sc.nextInt();
        System.out.print("Lucky Number's are : ");
            if(islucky(n)){
                System.out.print("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
