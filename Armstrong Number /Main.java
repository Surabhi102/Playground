import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
     int x = in.nextInt();
    
     
      int temp = x;
      int sum=0;
      while(temp!=0)
      {
        int r= temp%10;
        sum = sum+(r*r*r);
        temp = temp/10;
      }
          if(sum==x)
          {
            System.out.println("Armstrong Number");
          }
        else 
        {
          System.out.println("Not a Armstrong Number");
        }
	}
}