class sumseries{
    public static void main(String[]args){
        int i,k=1,s=0;
        for(i=1;i<=10;i++){
            if(i%2==0)
            s=s-k;
            else
            s=s+k;
            k+=2;
            System.out.println("sum of series:"+s);
        }
    }
}