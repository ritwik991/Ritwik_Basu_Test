import java.util.*;
public class Interest {
	public static void main(String[] args)
	{	
    double pr,rate,t,sim,com;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount:");
    pr=sc.nextDouble();
    System.out.println("Enter the rate:");
    rate=sc.nextDouble();
    System.out.println("Enter the time:");
    t=sc.nextDouble();
    sim=(pr*rate*t)/100;
    com=pr*Math.pow(1.0+rate/100.0,t)-pr;
    System.out.println("Simple interest="+sim);
    System.out.println("Compound interest="+com);
   }
}
