import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int temp = in.nextInt();
      int n = temp;
      int sum = 0;
      while(n!=0)
      {
         int i=1;
       int  p=1;
        int r = n%10;
        while(i<=r)
        {
          p=p*i;
          i++;
        }
        sum = sum+p;
         n= n/10;
      }
      if(sum==temp)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        
	}
}