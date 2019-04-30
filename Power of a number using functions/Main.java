import java.util.Scanner;
class Main {
  public static int power(int n, int m)
  {
     int mul = n;
    for(int i=1; i<m; i++)
    {
      mul = mul*n;
    }
    return mul;
  }
  public static void main(String h[])
  {
    Scanner  in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int num = power(a,b);
      System.out.print(num);
  }
}
 