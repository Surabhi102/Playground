import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int a_s = in.nextInt();
      int a[] = new int[a_s];
      for(int index=0; index<=a_s-1; index++)
      {
        a[index] = in.nextInt();
      }
      zero(a_s, a);
      for(int index=0; index<=a_s-1; index++)
      {
        System.out.print(a[index]+" ");
      }
    }
  public static void zero(int a_s, int a[])
  {
    int count = 0; 
    for(int index=0; index<= a_s-1; index++)
    {
      if(a[index]!=0)
      {
        int temp = a[index];
        a[index] = a[count];
        a[count] = temp;
        count++;
      }
    }
  }
}