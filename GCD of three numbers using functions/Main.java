import java.util.Scanner;
public class Main{
  public static int gcd(int n1, int n2)
  {
    int min, gcd=0;
      if(n1<n2)
      {
        min=n1;
      }
    else
    {
      min=n2;
    }
    while(min>=1)
    {
      if((n1%min==0)&&(n2%min==0))
      {
        gcd=min;
        break;
      }
      min--;
    }
    return gcd;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int g1= gcd(a,b);
      int g2 = gcd(g1,c);
      System.out.print(g2);
	}
}