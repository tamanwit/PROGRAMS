//checking prime number in java using recursion
import java.util.*;
class primenumber{
    public static boolean check(int n, int i){
      //base case 
        if(n<=2){
            return((n==2)?true:false);
        }
      //divisiblity check
        if(n%i==0){
            return false;
        }
      //exception check
        if(i*i>n){
            return true;
        }
      //self calling of the method
        return check(n, i+1);
    }
    public static void main(String[]args){
        int n = 5; //number to check 
        int i = 2; //for iteration
        System.out.print(check(n, i));
    }
}
