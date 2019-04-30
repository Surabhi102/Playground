import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code her
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int cur = 1;
      {
      for(int i=1; i<=n; i++)
      {
        System.out.println(cur);
        cur=cur+2;
      }}
        
	}
}