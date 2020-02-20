import java.util.*;
public class Construction
{
 public static void main(String[] args)
 {	
  String material;
  int area,cost;
  Scanner sc=new Scanner(System.in);
  material=sc.nextLine();
  area=sc.nextInt();
  System.out.println("Do you want fully automated home?");
  boolean bn=sc.nextBoolean();
  if(material==standard materials)
  {
	  cost=1200*area;
  }
  else if(material==above standard materials)
  {
	  cost=1500*area;
  }
  else if(material==high standard materials)
  {
	  cost=1800*area;
  }
  else if(material==high standard materials && bn==true)
  {
	  cost=2500*area;
  }
 }
}
