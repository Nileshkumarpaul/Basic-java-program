import java.util.Scanner;
public class basicsalary{
    public static void main(String[]args){
        Scanner S=new Scanner(System.in);
        int basic,da,hra,gs=0;
        System.out.println("Enter the value of basic:");
        basic=S.nextInt();
        da=basic*40/100;
        hra=basic*20/100;
        gs=basic+da+hra;
        System.out.println("da is:"+da);
        System.out.println("hra is:"+hra);
        System.out.println("gross salary:"+gs);
    }
}