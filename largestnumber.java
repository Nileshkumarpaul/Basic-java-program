import java.util.*;
public class largestnumber{
    public static void main(String[]args){
        Scanner S=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the 1st number:");
        a=S.nextInt();
        System.out.println("Enter the 2nd number:");
        b=S.nextInt();
        System.out.println("Enter the 3rd number:");
        c=S.nextInt();
        {
        if(a>=b && a>=c)
        System.out.println("The greatest number is :"+a);
        else if(b>=a && b>=c)
        System.out.println("The largest number is:"+b);
        else 
        System.out.println("The largest number is:"+c);
    }
}
}