import java.util.Scanner;
class Main 
{
  public static void left(int a_s, int a[], int no_r)
  {
    int f_i = 1;
    int l_i;
    if(a_s%2==0)
    {
      l_i = a_s-1;
    }
    else
    {
      l_i = a_s-2;
    }
    for(int rot=1; rot<=no_r; rot++)
    {
      int temp = a[f_i];
      for(int index =3; index<a_s; index = index+2)
      {
        a[index-2] = a[index];
      }
      a[l_i] = temp;
    }
  }
  public static void right(int a_s, int a[], int no_r)
  {
    int f_i = 0;
    int l_i;
    if(a_s%2==1)
    {
      l_i = a_s-1;
    }
    else
    {
      l_i = a_s-2;
    }
    for(int rot=1; rot<=no_r; rot++)
    {
      int temp = a[l_i];
      for(int index=(l_i-2); index>=0; index = index-2)
      {
        a[index+2] = a[index];
      }
      a[f_i] = temp;
    }
  }
    
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int a_s = in.nextInt();
    int a[] = new int[a_s];
    for(int index=0; index<=(a_s-1); index++)
    {
      a[index] = in.nextInt();
    }
    int no_r = in.nextInt();
    left(a_s, a, no_r);
    right(a_s, a, no_r);
    for(int index=0; index<=(a_s-1); index++)
    {
      System.out.print(a[index]+" ");
    }
  	}
}