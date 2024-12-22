/**
 * WAP in java to show the followwing
 * Input  : I am Indian
 * Output:  I
 *          am
 *          Indian
 * Condition : String can't be manipulated // Tokenizer not allowed
 */

import java.util.Scanner;
class str{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter String to check : ");
        str = sc.nextLine();
        //no string manipulation allowed -- new rule
        int space=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                space++;
            }
        }
        String nst="";
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==' '){
                System.out.println(nst);
                nst="";
                space--;
                continue;
            }
            if(space==0){
                System.out.println(str.substring(i, str.length()));
                break;
            }
            nst = nst + str.charAt(i);
        }
    }
}
