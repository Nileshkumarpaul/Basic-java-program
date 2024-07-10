import java.util.Scanner;
public class numericals{
    public static void main(String[]args){
        int a,b,add,sub,div,multi;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        a=S.nextInt();
        System.out.println("Enter the 2nd number:");
        b=S.nextInt();
        add=a+b;
        sub=a-b;
        div=a/b;
        multi=a*b;
        System.out.println("Addition of two number is:"+add);
        System.out.println("Subtraction of two number is:"+sub);
        System.out.println("Divission of wo number is:"+div);
        System.out.println("Multiplicatin of two number:"+multi);
    }
}