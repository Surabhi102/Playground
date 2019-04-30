import java.util.Scanner;
class Main
{
  public static void perfect_Batch(int list[], int n)
  {
    boolean is_perfect = true;
    int batch_sum= list[0]+list[1]+list[2];
    for(int i = 3; i<=(n-1); i=i+3)
    {
      int cur_bat = list[i]+ list[i+1] + list[i+2];
    if(cur_bat != batch_sum)
    {
      is_perfect = false;
    }
    }
    if(is_perfect == true)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
  }
    
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i =0; i<n; i++)
    {
      list[i] = in.nextInt();
    }
    perfect_Batch(list, n);
   
  }
}