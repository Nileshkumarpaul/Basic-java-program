public class rangeleapyear{
    public static void main(String[]args){
     int i,count=0;
     for(i=1900;i<=2200;i++)
     if(i%4==0)
     System.out.println("The year is a leap year:"+i);
     count=count+i;
     System.out.println("Total no of leapyear:"+count);
    }
}