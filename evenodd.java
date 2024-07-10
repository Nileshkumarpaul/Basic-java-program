import java.util.*;
public class evenodd{
    public static void main (String[]args){
        Scanner S=new Scanner(System.in);
        int i;
        System.out.println("Enter the value of i:");
        i=S.nextInt();
        if(i%2==0)
        System.out.println("The number is even number:");
        else
        System.out.println("The number is odd number:");
    }
}