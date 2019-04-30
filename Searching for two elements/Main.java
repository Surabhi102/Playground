import java.util.Scanner;
class Main{
  public static void src(int m, int s[], int num)
  {
    int count=0;
    for(int j=0; j<=(m-1); j++)
       {
      if(num==s[j])
      {
        System.out.println(j);
        count++;
        }
     }
    if(count==0)
    {
      System.out.print("-1");
    }
    
    
  }
    
    
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int a[] = new int[n];
      for(int i=0; i<=(n-1); i++)
      {
        a[i] = in.nextInt();
      }
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      src(n, a, n1);
      src(n, a, n2);
        
    }
}