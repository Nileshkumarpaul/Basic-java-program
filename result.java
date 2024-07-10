import java.util.Scanner;
public class result{
    public static void main(String[]args){
        int a,b,c,total,avg;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the marks of a:");
        a=S.nextInt();
        System.out.println("Enter the marks of b:");
        b=S.nextInt();
        System.out.println("Enter the marks of c:");
        c=S.nextInt();
        total=a+b+c;
        avg=total/3;
        System.out.println("total number:"+total);
        System.out.println("avg number:"+avg);
        if (avg>=80)
        System.out.println("grade is A:");
        else if(avg>=60)
        System.out.println("grade is B:");
        else if(avg<40)
        System.out.println("the students is fail:");
    }
}