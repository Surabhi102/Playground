import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int a_s = in.nextInt();
      int a[] = new int[a_s];
      for(int i=0; i<=a_s-1; i++)
      {
        a[i] = in.nextInt();
      }
      three(a_s, a);
    }
  public static void three(int a_s, int a[])
  {
    for(int i1=0; i1<=a_s-2; i1++)
    {
      for(int i2=i1+1; i2<=a_s-1; i2++)
      {
        for(int i3=i2+1; i3<=a_s-1; i3++)
        {
          System.out.print("("+ a[i1]+ ","+" "+a[i2]+","+" "+a[i3]+")"+" ");
        }
      }
      System.out.println();
    }
  }
}