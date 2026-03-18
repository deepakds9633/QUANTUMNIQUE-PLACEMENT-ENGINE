import java.util.*;
public class Main{
    public static void main(String...oino){
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int ss=s,ans=0;
    while(s>0){
        int dig=s%10;
        ans=(ans*10)+dig;
        s/=10;
    }
    if(ss==ans){
        System.out.print(true);
    }
    else{
        System.out.print(false);
    }
    }
}