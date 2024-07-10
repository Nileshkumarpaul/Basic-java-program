import java.util.*;
public class swaping{
    public static void main(String[]args){
        int a,b,tem;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the number of a:");
        a=S.nextInt();
        System.out.println("Enter the number of b:");
        b=S.nextInt();
        tem=a;
        a=b;
        b=tem;
        System.out.println("the value of a:"+a);
        System.out.println("The value of b:"+b);
    }
}