//vampire number checking in java using String functions only
import java.util.*;
public class vampire_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n=sc.nextInt(),i,j,k,z=0;
        String a=Integer.toString(n),x,y;
        for(i=1;i<=n;i++)
          if(n%i==0)
            z++;
        if(z==2||a.length()%2!=0)
        {
          System.out.println("Invalid Number.");
          return;
        }
        for(i=0;i<a.length();i++)
        {
            x=a.substring(0,a.length()/2);
            y=a.substring(a.length()/2);
            z=(a.length()/2)*(a.length()/2);
            for(j=0;j<z;j++)
            {
                for(k=0;k<z;k++)
                {
                    if(Integer.parseInt(x)*Integer.parseInt(y)==n&&Integer.parseInt(x)%10==0&&Integer.parseInt(y)%10==0)
                    {
                        System.out.println(n+" is a Vampire Number.");
                        return;
                    }
                    y=y.substring(1)+y.charAt(0);
                }
                x=x.substring(1)+x.charAt(0);
            }
        }
        System.out.println(n+" is not a Vampire Number.");
    }
}
