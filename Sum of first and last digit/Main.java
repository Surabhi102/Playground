import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int last = n%10;
      int first = n;
      while(n>=10)
      {
        n= n/10;
      }
      first = n;
       int sum= first+last;
      System.out.println(sum);
	}
}