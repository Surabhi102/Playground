import java.util.Scanner;
class Main{
  public static int greatest(int n1, int n2)
  {
    int great=0;
    if(n1>n2)
    {
      great = n1;
    }
    else
    {
      great = n2;
    }
    return great;
  }
        
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      int g = greatest(a,b);
      if(g>c)
      {
        System.out.print(g);
      }
      else
      {
        System.out.print(c);
      }
      
	}
}