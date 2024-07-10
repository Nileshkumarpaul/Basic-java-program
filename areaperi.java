import java.util.*;
public class areaperi{
public static void main(String[]args){
    Scanner S=new Scanner(System.in);
    int l,b,area1,peri1;
    System.out.println("enter the length:");
    l=S.nextInt();
    System.out.println("enter the breadth:");
    b=S.nextInt();
    area1=l*b;
    peri1=2*(l*b);
    System.out.println("Area of a rectangle:"+area1);
    System.out.println("Perimeter of a rectangle:"+peri1);
    
}
}