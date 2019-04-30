import java.util.Scanner;
class Main{
  public static void per(int a_s, int a[], int val)
  {
    for(int i1=0; i1<=a_s-1; i1++)
    {
      for(int i2=i1+1; i2<=a_s-1; i2++)
      {
        int sum = a[i1]+a[i2];
        if(sum==val)
        {
          System.out.println(a[i1]+","+" "+a[i2]);
        }
      }
    }
  }
      
    public static void main(String args[]) {
      // Type your code herest
      Scanner in = new Scanner(System.in);
      int a_s = in.nextInt();
      int a[] = new int[a_s];
      for(int i=0; i<=a_s-1; i++)
      {
        a[i] = in.nextInt();
      }
      int val = in.nextInt();
      per(a_s, a, val);
    }
}
  