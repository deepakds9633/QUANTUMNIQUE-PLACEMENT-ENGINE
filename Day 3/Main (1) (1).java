import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	String ns = s.replaceAll("\\s", "").toLowerCase(); 

int start=0,end=ns.length()-1;

while(start<end) {
	if(ns.charAt(start)==ns.charAt(end)) {
		end--;
		start++;
	}
	else {
		System.out.print(false);
		return;
	}
}
 System.out.println(true);
	}
}