import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num=1;
      for(int i=1; i<=n; i++)
      {
        for(int k=1; k<=(n-(i-1)-1); k++)
        {
          System.out.print(" ");
        }
        for(int j=1; j<=i; j++)
        {
          System.out.print(num+" ");
          num = num+1;
        }
        System.out.println();
      }
    }    
}