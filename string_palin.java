import java.util.*;
public class string_palin {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String str, wrd="", pal="";
        System.out.println("Enter string to check for palindromic words : ");
        str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            wrd = st.nextToken();
            for(int i=0; i<wrd.length(); i++){
                pal = wrd.charAt(i) + pal;
            }
            if(wrd.equalsIgnoreCase(pal)){
                System.out.println(pal);
            }
            pal="";
        }
    }
}
