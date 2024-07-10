import java.util.*;
public class discount{
    public static void main(String[]args){
        Scanner S=new Scanner(System.in);
        int a;
        System.out.println("Enter the commision:");
        a=S.nextInt();
        if(a>=40000)
        System.out.println(40000*40/100);
        else if(a>=30000)
        System.out.println(30000*30/100);
        else if(a<=29000)
        System.out.println(29000*0/100);
    }
}