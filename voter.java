import java.util.Scanner;
public class voter{
    public static void main(String[]args){
        int age;
        Scanner S=new Scanner (System.in);
        System.out.println("Enter the age of a person:");
        age=S.nextInt();
        if(age>=18)
            System.out.println("The person is eligible for vote");
            else
             System.out.println("The person is not eligible for vote");
        }
    }