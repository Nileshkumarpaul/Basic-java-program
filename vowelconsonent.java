import java.util.*;
public class vowelconsonent{
    public static void main(String[]args){
        Scanner S=new Scanner(System.in);
        char ch;
        System.out.println("Enter the character:");
        ch=S.next().charAt(0);
        S.close();
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        System.out.println("The character is vowel.");
        else
        System.out.println("the character is consonent.");
    }
}