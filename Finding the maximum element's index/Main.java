import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int max;
    int list[]= new int[n];
    for(int i=0; i<n; i++)
    {
      list[i] = in.nextInt();
    }
    if(list[0]>list[1])
    {
      max = 0;
    }
    else
    {
      max = 1;
    }
    for( int ind = 2; ind<=(n-1); ind++)
    {
      if(list[max] < list[ind])
      {
        max = ind;
      }
     
    }
     System.out.println(max);
  }
}