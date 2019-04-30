import java.util.Scanner;
class Main{
  public static void prime(int n)
  {
    for(int i=2; i<=n; )
     {
        int prime=1;
      for(int l = 2; l<=i; l++)
      {
        if((i%l)==0 && l!=i){
          prime = 0;
      }
     }
    if(prime !=0)
    {
      System.out.println(i);
      i++;
    }
    else
    {
      i++; } } }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      prime(a);
      
      
      
	}
}