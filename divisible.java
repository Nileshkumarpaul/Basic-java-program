import java.util.*;
public class divisible{
    public static void main(String[]args){
        int d,D,q,r;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the divisor:");
        d=S.nextInt();
        System.out.println("Enter the divident:");
        D=S.nextInt();
        q=d/D;
        r=d%D;
        System.out.println("The quteiont is :"+q);
        System.out.println("The reminder is:"+r);
    }
}